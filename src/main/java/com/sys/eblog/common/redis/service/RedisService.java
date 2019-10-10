/*
package com.sys.eblog.common.redis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@Service
public class RedisService {
	
	private final static Logger logger = LoggerFactory.getLogger(RedisService.class);

    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    */
/**
     * 写入缓存
     * @param key
     * @param value
     * @return
     *//*

    public boolean set(final String key, String value) {
        boolean result = false;
        try {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            result = true;
            logger.info(TAGS+"redis set key="+key+",value="+value.toString());
        } catch (Exception e) {
            logger.error(TAGS+LogUtil.getExecetionInfo(e));
        }
        return result;
    }
    */
/**
     * 写入缓存设置时效时间（s）
     * @param key
     * @param value
     * @return
     *//*

    public boolean set(final String key, String value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, String> operations = redisTemplate.opsForValue();
            operations.set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
            logger.info(TAGS+"redis set key="+key+",value="+value.toString()+",exp="+expireTime);
        } catch (Exception e) {
            logger.error(TAGS+LogUtil.getExecetionInfo(e));
        }
        return result;
    }
    */
/**
     * 批量删除对应的value
     * @param keys
     *//*

    public void remove(final String... keys) {
        for (String key : keys) {
            remove(key);
        }
        logger.info(TAGS+"removes:"+keys.toString());
    }

    */
/**
     * 批量删除key
     * @param pattern
     *//*

    public void removePattern(final String pattern) {
        Set<String> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
        logger.info(TAGS+"delete keys:"+keys.toString());

    }
    */
/**
     * 删除对应的value
     * @param key
     *//*

    public void remove(final String key) {
        if (exists(key)) {
            redisTemplate.delete(key);
            logger.info(TAGS+"delete key:"+key);
        }
    }
    */
/**
     * 判断缓存中是否有对应的value
     * @param key
     * @return
     *//*

    public boolean exists(final String key) {
        return redisTemplate.hasKey(key);
    }
    */
/**
     * 读取缓存
     * @param key
     * @return
     *//*

    public String get(final String key) {
        String result = null;
        ValueOperations<String, String> operations = redisTemplate.opsForValue();
        result = operations.get(key);
        logger.info(TAGS+"get k-v:",key,result);
        return result;
    }
    */
/**
     * 哈希 添加
     * @param key
     * @param hashKey
     * @param value
     *//*

    public void hmSet(String key, String hashKey, String value){
        HashOperations<String, String, String>  hash = redisTemplate.opsForHash();
        hash.put(key,hashKey,value);
        logger.info(TAGS+"hmSet k,h,v:",key,hashKey,value);
    }
    */
/**
     * 哈希获取数据
     * @param key
     * @param hashKey
     * @return
     *//*

    public String hmGet(String key, String hashKey){
        HashOperations<String, String, String>  hash = redisTemplate.opsForHash();
        return hash.get(key,hashKey);
    }

    */
/**
     * 列表添加
     * @param k
     * @param v
     *//*

    public void lPush(String k,String v){
        ListOperations<String, String> list = redisTemplate.opsForList();
        list.rightPush(k,v);
        logger.info(TAGS+"lPush k-v:",k,v);
    }

    */
/**
     * 列表获取
     * @param k
     * @param l
     * @param l1
     * @return
     *//*

    public List<String> lRange(String k, long l, long l1){
        ListOperations<String, String> list = redisTemplate.opsForList();
        
        return list.range(k,l,l1);
    }

    */
/**
     * 集合添加
     * @param key
     * @param value
     *//*

    public void add(String key,String value){
        SetOperations<String, String> set = redisTemplate.opsForSet();
        set.add(key,value);
        logger.info(TAGS+"set set k-v:",key,value);
    }

    */
/**
     * 集合获取
     * @param key
     * @return
     *//*

    public Set<String> setMembers(String key){
        SetOperations<String, String> set = redisTemplate.opsForSet();
        return set.members(key);
    }

    */
/**
     * 有序集合添加
     * @param key
     * @param value
     * @param scoure
     *//*

    public void zAdd(String key,String value,double scoure){
        ZSetOperations<String, String> zset = redisTemplate.opsForZSet();
        zset.add(key,value,scoure);
        logger.info(TAGS+"lPush k-h-v:",key,value,scoure);
    }

    */
/**
     * 有序集合获取
     * @param key
     * @param scoure
     * @param scoure1
     * @return
     *//*

    public Set<String> rangeByScore(String key,double scoure,double scoure1){
        ZSetOperations<String, String> zset = redisTemplate.opsForZSet();
        return zset.rangeByScore(key, scoure, scoure1);
    }
}*/
