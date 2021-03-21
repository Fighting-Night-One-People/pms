package com.gengshuaishuai.pms.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author 耿帅帅
 * @version 1.0
 * @date 2021/3/21 18:41
 * @description spring redis 工具类
 */
@Component
public class RedisCache {
    @Autowired
    public RedisTemplate redisTemplate;

    /**
     * show 缓存基本的对象，Integer、String、实体类等
     *
     * @param key 缓存的键值
     * @param value 缓存的值
     * @param <T>
     */
    public <T> void setCacheObject(final String key,final T value){
        redisTemplate.opsForValue().set(key,value);
    }

    /**
     * show 缓存基本的对象，Integer、String、实体类等
     *
     * @param key 缓存的键值
     * @param value 缓存的值
     * @param timeout 时间
     * @param timeUnit 时间颗粒度
     * @param <T>
     */
    public <T> void setCacheObject(final String key, final T value, final Integer timeout, final TimeUnit timeUnit){
        redisTemplate.opsForValue().set(key,value,timeout,timeUnit);
    }

}
