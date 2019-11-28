package com.jzhl.queue.service;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.queue.controller.RedisQueue;
import com.jzhl.queue.mapper.DoorFaceDeviceRelationDAO;
import com.jzhl.queue.mapper.DoorFaceInfoDAO;
import com.jzhl.queue.mapper.DoorSubDeviceDAO;
import com.jzhl.queue.mapper.SysConfigDAO;
import com.jzhl.queue.model.*;
import com.jzhl.queue.utils.ImageUtil;
import com.jzhl.queue.utils.JuLongUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class FaceService {

    private String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";

    //队列里边的数据泛型可以根据实际情况调整, 可以定义多个类似的队列
    private RedisQueue<JSONObject> redisQueue = null;

    @Resource
    DoorFaceInfoDAO doorFaceInfoDAO;

    @Resource
    DoorFaceDeviceRelationDAO doorFaceDeviceRelationDAO;

    @Resource
    DoorSubDeviceDAO doorSubDeviceDAO;

    @Resource
    SysConfigDAO sysConfigDAO;

    @Resource
    private RedisTemplate redisTemplate;

    /**
     * 给巨龙设备添加对应的人脸
     */
    public void addFace(Integer relationId, String type, Integer time){
        System.out.println(" date frist: relationId : " + relationId + " type: " + type + "  time:" + time);

        DoorFaceDeviceRelation doorFaceDeviceRelation = selectRelation(relationId);
        if(doorFaceDeviceRelation == null){
            //不存在人脸设备关联信息
            isFaill(relationId, "不存在人脸设备关联信息");
            return;
        }

        // 查询人脸信息
        DoorFaceInfo doorFaceInfo = selectFaceInfo(doorFaceDeviceRelation.getFaceId());
        if(doorFaceInfo == null){
            // 不存在人脸信息
            isFaill(relationId, "不存在人脸信息");
            return;
        }

        // 查询设备信息
        DoorSubDevice doorSubDevice = selectDeviceInfo(doorFaceDeviceRelation.getDoorSubDeviceId());
        if(doorSubDevice == null){
            // 不存在设备
            isFaill(relationId, "不存在设备");
            return;
        }

        //查询巨龙人脸识别中间件配置url
        SysConfig sysConfig = sysConfig();
        if(sysConfig == null){
            // 系统配置中间件url不存在
            isFaill(relationId, "系统配置中间件url不存在");
            return;
        }

        switch (type){
            case "add":
                JSONObject jsonObjectAdd = JuLongUtil.addOnePic(doorSubDevice.getCustomId(), sysConfig.getValue(), doorFaceDeviceRelation.getJulongMode(), doorFaceInfo.getFaceImgNum(), doorFaceInfo.getFaceImgNum(), ImageUtil.imgBase64(doorFaceInfo.getFaceImgUrl()).replaceAll("\r|\n", ""));
                if(jsonObjectAdd == null){
                    isFaill(relationId, "设备不在线或者其他错误");
                    return;
                }
                if(jsonObjectAdd.get("Code") != null){
                    //上次失败
                    isFailRemark(relationId, JuLongUtil.code[-(int)jsonObjectAdd.get("Code")], type, time);
                }else{
                    JSONObject index = (JSONObject)jsonObjectAdd.get("AddOnePic");
                    isOk(relationId, (Integer) index.get("FlieIndex"), (Integer) index.get("LibIndex"));
                }
                break;
            case "del":
                JSONObject jsonObjectDel = JuLongUtil.delOnePic(doorSubDevice.getCustomId(), sysConfig.getValue(), doorFaceDeviceRelation.getJulongMode(), doorFaceInfo.getFaceImgNum() + "_" + doorFaceInfo.getFaceImgNum() + ".jpg", doorFaceDeviceRelation.getJulongLibIndex(), doorFaceDeviceRelation.getJulongFlieIndex());

                if(jsonObjectDel == null){
                    isFaill(relationId, "设备不在线或者其他错误");
                    return;
                }
                if(jsonObjectDel == null){
                    return;
                }
                if(jsonObjectDel.get("Code") != null){
                    //上次失败
                    isFailRemark(relationId, JuLongUtil.code[-(int)jsonObjectDel.get("Code")], type, time);
                    return;
                }
                isDelOk(relationId);
                break;
            default:
                break;
        }
    }


    // 将人脸传递给设备失败 --  5次轮询之后失败
    public void isFaill(Integer relationId, String result){
        // 插入失败，记录失败原因
        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andIdEqualTo(relationId);
        criteria.andDelFlagEqualTo("0");

        DoorFaceDeviceRelation doorFaceDeviceRelation = new DoorFaceDeviceRelation();
        doorFaceDeviceRelation.setStatus("2");
        doorFaceDeviceRelation.setRemark(result);
        doorFaceDeviceRelation.setUpdateTime(new Date());

        doorFaceDeviceRelationDAO.updateByExampleSelective(doorFaceDeviceRelation, doorFaceDeviceRelationExample);
    }

    // 将人脸传递给设备成功
    public void isOk(Integer relationId, int flieIndex, int libIndex){

        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andIdEqualTo(relationId);
        criteria.andDelFlagEqualTo("0");

        DoorFaceDeviceRelation doorFaceDeviceRelation = new DoorFaceDeviceRelation();
        doorFaceDeviceRelation.setRemark("图片操作成功");
        doorFaceDeviceRelation.setStatus("1");
        doorFaceDeviceRelation.setJulongFlieIndex(flieIndex);
        doorFaceDeviceRelation.setJulongLibIndex(libIndex);
        doorFaceDeviceRelation.setUpdateTime(new Date());

        doorFaceDeviceRelationDAO.updateByExampleSelective(doorFaceDeviceRelation, doorFaceDeviceRelationExample);
    }


    // 从设备中删除人脸关系成功
    public void isDelOk(Integer relationId){
        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andIdEqualTo(relationId);
        criteria.andDelFlagEqualTo("0");

        DoorFaceDeviceRelation doorFaceDeviceRelation = new DoorFaceDeviceRelation();
        doorFaceDeviceRelation.setRemark("图片删除操作成功");
        doorFaceDeviceRelation.setDelFlag("1");
        doorFaceDeviceRelation.setUpdateTime(new Date());

        doorFaceDeviceRelationDAO.updateByExampleSelective(doorFaceDeviceRelation, doorFaceDeviceRelationExample);
    }



    public void isFailRemark(Integer relationId, String error, String type, Integer time){

        // 插入失败，记录失败原因
        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andIdEqualTo(relationId);
        criteria.andDelFlagEqualTo("0");

        DoorFaceDeviceRelation doorFaceDeviceRelation = new DoorFaceDeviceRelation();
        doorFaceDeviceRelation.setRemark(error);
        doorFaceDeviceRelation.setUpdateTime(new Date());

        doorFaceDeviceRelationDAO.updateByExampleSelective(doorFaceDeviceRelation, doorFaceDeviceRelationExample);

        //再次将数据插入队列, 参与轮询
        String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";
        RedisQueue<JSONObject> redisQueue = redisQueue = new RedisQueue(redisTemplate, ORDER_SEND_REDIS_QUEQUE);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("relationId", relationId);
        jsonObject.put("type", type);
        jsonObject.put("time", time + 1);

        redisQueue.pushFromTail(jsonObject);
    }


    /**
     * 根据 SysConfig 系统配置表获取对应的巨龙中间件url地址
     * @return
     */
    public SysConfig sysConfig(){
        SysConfigExample sysConfigExample = new SysConfigExample();
        SysConfigExample.Criteria criteria = sysConfigExample.createCriteria();
        criteria.andCodeEqualTo("JULONG-ZJ-URL");
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");

        List<SysConfig> sysConfigs = sysConfigDAO.selectByExample(sysConfigExample);
        if(sysConfigs.size() > 0){
            return sysConfigs.get(0);
        }
        return null;
    }

    /**
     * 根据子设备ID 获取设备信息
     * @param subDeviceId
     * @return
     */
    public DoorSubDevice selectDeviceInfo(Integer subDeviceId){
        DoorSubDeviceExample doorSubDeviceExample = new DoorSubDeviceExample();
        DoorSubDeviceExample.Criteria criteria = doorSubDeviceExample.createCriteria();
        criteria.andIdEqualTo(subDeviceId);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        List<DoorSubDevice> doorSubDevices = doorSubDeviceDAO.selectByExample(doorSubDeviceExample);
        if(doorSubDevices.size() > 0){
            return doorSubDevices.get(0);
        }
        return null;
    }

    /**
     * 根据人脸ID 获取人脸信息
     * @param faceId
     * @return
     */
    public DoorFaceInfo selectFaceInfo(Integer faceId){
        DoorFaceInfoExample doorFaceInfoExample = new DoorFaceInfoExample();
        DoorFaceInfoExample.Criteria criteria = doorFaceInfoExample.createCriteria();
        criteria.andIdEqualTo(faceId);
        criteria.andDelFlagEqualTo("0");

        List<DoorFaceInfo> doorFaceInfos = doorFaceInfoDAO.selectByExample(doorFaceInfoExample);
        if(doorFaceInfos.size() > 0){
            return doorFaceInfos.get(0);
        }
        return null;
    }


    /**
     * 根据 ID 获取对应的人脸信息和设备的关联信息
     * @param relationId
     * @return
     */
    public DoorFaceDeviceRelation selectRelation(Integer relationId){
        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andIdEqualTo(relationId);
        criteria.andDelFlagEqualTo("0");

        List<DoorFaceDeviceRelation> doorFaceDeviceRelations = doorFaceDeviceRelationDAO.selectByExample(doorFaceDeviceRelationExample);

        if(doorFaceDeviceRelations.size() > 0){
            return doorFaceDeviceRelations.get(0);
        }
        return null;
    }

}
