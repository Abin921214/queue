package com.jzhl.queue.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;


@Configuration
public class config {

    private String redisHost = "127.0.0.1";
    private Integer redisPort = 6379;
    private String redisPassword = "";
    private Integer timeout = 60;

    @Bean
    public JedisPoolConfig getJedisPoolConfig(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大空闲连接数, 默认8个
        jedisPoolConfig.setMaxIdle(4);
        //最大连接数, 默认8个
        jedisPoolConfig.setMaxTotal(8);
        //最小空闲连接数, 默认0
        jedisPoolConfig.setMinIdle(1);
        //获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
        jedisPoolConfig.setMaxWaitMillis(15000);
        //逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(300000);
        //每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(3);
        //一个连接在池中最小生存的时间
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(60000);
        //连接超时时是否阻塞，false时报异常,ture阻塞直到超时, 默认true
        jedisPoolConfig.setBlockWhenExhausted(true);
        return jedisPoolConfig;
    }

    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory getJedisConnectionFactory(JedisPoolConfig jedisPoolConfig){
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        jedisConnectionFactory.setHostName(redisHost);
        jedisConnectionFactory.setPort(redisPort);
        jedisConnectionFactory.setPassword(redisPassword);
        jedisConnectionFactory.setTimeout(timeout);
        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate getRedisTemplate(@Qualifier("jedisConnectionFactory") JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        redisTemplate.setDefaultSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
