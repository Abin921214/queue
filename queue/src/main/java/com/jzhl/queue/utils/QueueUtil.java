package com.jzhl.queue.utils;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.queue.bean.SpringFactory;
import com.jzhl.queue.service.FaceService;

public class QueueUtil {

    /**
     * data{
     *        "relationId" ： 人脸设备关联关系
     *        "type"       : add  /  del
     *        "time"       :  加入轮询的次数   超过5次 将直接操作失败，不在加入轮询队列
     *     }
     * @param data
     */
    public static void queue(JSONObject data){

        try {
            //获取人脸的 service 层对象
            FaceService faceService = (FaceService) SpringFactory.getBean("faceService");

            if(data.getInteger("time") > 5){
                faceService.isFaill((Integer) data.get("relationId"), "添加失败, 请重试");
                return;
            }

            //开始将人脸放到设备中去
            faceService.addFace((Integer) data.get("relationId"), (String) data.get("type"), (Integer)data.get("time"));
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

}
