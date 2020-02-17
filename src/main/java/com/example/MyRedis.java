package com.example;


import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
* @desc    Redis客户端
* @version 1.0
* @author  Liang Jun
* @date    2020年02月03日 20:30:15
**/
@Component
public class MyRedis {
    @Resource
    private RedisTemplate redisTemplate;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public void test() {
        redisTemplate.opsForValue().set("k1", 1111);
        System.out.println(redisTemplate.opsForValue().get("k1"));
        stringRedisTemplate.opsForValue().set("k2", "2222");
        System.out.println(stringRedisTemplate.opsForValue().get("k2"));
    }
}