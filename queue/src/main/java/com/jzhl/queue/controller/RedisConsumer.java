package com.jzhl.queue.controller;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.queue.bean.RedisTaskContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class RedisConsumer extends Thread{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private RedisTaskContainer container;

    private Consumer<JSONObject> consumer;

    public RedisConsumer(RedisTaskContainer container, Consumer<JSONObject> consumer){
        this.container = container;
        this.consumer = consumer;
    }

    @Override
    public void run() {
        try{
            while(true){
                JSONObject value = container.getRedisQueue().takeFromTail();//cast exception? you should check.
                //逐个执行
                if(value != null){
                    try{
                        consumer.accept(value);
                    }catch(Exception e){
                        logger.error("调用失败", e);
                    }
                }
            }
        }catch(Exception e){
            logger.error("轮循线程异常退出", e);
        }
    }
}
