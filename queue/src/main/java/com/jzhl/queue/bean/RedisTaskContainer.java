package com.jzhl.queue.bean;

import com.alibaba.fastjson.JSONObject;
import com.jzhl.queue.controller.RedisConsumer;
import com.jzhl.queue.controller.RedisQueue;
import com.jzhl.queue.utils.QueueUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

@Component
public class RedisTaskContainer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static int runTaskThreadNum = 2;//Runtime.getRuntime().availableProcessors()

    //使用一个统一维护的线程池来管理隔离线程
    private static ExecutorService es = Executors.newFixedThreadPool(runTaskThreadNum);

    @Resource
    private RedisTemplate redisTemplate;

    public static String ORDER_SEND_REDIS_QUEQUE = "send:redis:queue";

    //队列里边的数据泛型可以根据实际情况调整, 可以定义多个类似的队列
    private RedisQueue<JSONObject> redisQueue = null;

    @PostConstruct
    private void init(){

        redisQueue = new RedisQueue(redisTemplate, ORDER_SEND_REDIS_QUEQUE);

        Consumer<JSONObject> consumer = (data) -> {
            // do something
            try {
//                Thread.sleep(5000);
                if(data.size() > 0){
                    // 具体操作
                    QueueUtil.queue(data);
                }
            }catch (Exception e){

            }
        };

        //提交线程
        for (int i = 0; i < runTaskThreadNum; i++) {
            es.execute(
                    new RedisConsumer(this, consumer)
            );
        }
    }

    public RedisQueue<JSONObject> getRedisQueue() {
        return redisQueue;
    }

}

