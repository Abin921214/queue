package com.jzhl.queue.controller;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.queue.bean.BaseResult;
import com.jzhl.queue.mapper.DoorFaceDeviceRelationDAO;
import com.jzhl.queue.model.DoorFaceDeviceRelation;
import com.jzhl.queue.model.DoorFaceDeviceRelationExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/julong")
public class QueueController {

    private  final Logger logger = LoggerFactory.getLogger(QueueController.class);

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    DoorFaceDeviceRelationDAO doorFaceDeviceRelationDAO;

    @RequestMapping("/face")
    public BaseResult face(Integer relationId, String type, Integer time){

        if(relationId == null || type == null || time == null){
            return new BaseResult("0", "不能为空", null);
        }

        String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";
        RedisQueue<JSONObject> redisQueue = redisQueue = new RedisQueue(redisTemplate, ORDER_SEND_REDIS_QUEQUE);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("relationId", relationId);
        jsonObject.put("type", type);
        jsonObject.put("time", time);

        redisQueue.pushFromTail(jsonObject);

        return new BaseResult("1", "ok", null);
    }

    @RequestMapping( value = "/faceAppAdd" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult faceAppAdd(Integer faceId, Integer doorSubDeviceId, Integer companyId, Integer time){

        if(faceId == null || doorSubDeviceId == null || companyId == null || time == null ){
            return new BaseResult("0", "必传不能为空", null);
        }

        int relationId = 0;

        DoorFaceDeviceRelationExample doorFaceDeviceRelationExample = new DoorFaceDeviceRelationExample();
        DoorFaceDeviceRelationExample.Criteria criteria = doorFaceDeviceRelationExample.createCriteria();
        criteria.andFaceIdEqualTo(faceId);
        criteria.andDoorSubDeviceIdEqualTo(doorSubDeviceId);
        criteria.andDelFlagEqualTo("0");
        criteria.andCompanyIdEqualTo(companyId);

        List<DoorFaceDeviceRelation> doorFaceDeviceRelations = doorFaceDeviceRelationDAO.selectByExample(doorFaceDeviceRelationExample);
        System.out.println(doorFaceDeviceRelations);
        if(doorFaceDeviceRelations.size() > 0){
            relationId = doorFaceDeviceRelations.get(0).getId();
        }else{
            DoorFaceDeviceRelation doorFaceDeviceRelation = new DoorFaceDeviceRelation();
            doorFaceDeviceRelation.setFaceId(faceId);
            doorFaceDeviceRelation.setDoorSubDeviceId(doorSubDeviceId);
            doorFaceDeviceRelation.setJulongMode(2);
            doorFaceDeviceRelation.setCompanyId(companyId);
            doorFaceDeviceRelation.setBuildTime(new Date());

            int id = doorFaceDeviceRelationDAO.insertSelective(doorFaceDeviceRelation);
            if(id > 0){
                List<DoorFaceDeviceRelation> doorFaceDeviceRelationList = doorFaceDeviceRelationDAO.selectByExample(doorFaceDeviceRelationExample);
                if(doorFaceDeviceRelationList.size() > 0){
                    relationId = doorFaceDeviceRelationList.get(0).getId();
                }
            }
        }

        if(relationId != 0){
            String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";
            RedisQueue<JSONObject> redisQueue = redisQueue = new RedisQueue(redisTemplate, ORDER_SEND_REDIS_QUEQUE);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("relationId", relationId);
            jsonObject.put("type", "add");
            jsonObject.put("time", time);

            redisQueue.pushFromTail(jsonObject);

            return new BaseResult("1", "等待系统添加人脸", null);
        }

        return new BaseResult("0", "提交失败", null);
    }


    @RequestMapping( value = "/faceAppDel" , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE } , produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public BaseResult faceAppDel(Integer relationId, Integer time){

        if(relationId == null || time == null){
            return new BaseResult("0", "必传不能为空", null);
        }

        String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";
        RedisQueue<JSONObject> redisQueue = redisQueue = new RedisQueue(redisTemplate, ORDER_SEND_REDIS_QUEQUE);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("relationId", relationId);
        jsonObject.put("type", "del");
        jsonObject.put("time", time);

        redisQueue.pushFromTail(jsonObject);

        return new BaseResult("1", "ok", null);
    }



}
