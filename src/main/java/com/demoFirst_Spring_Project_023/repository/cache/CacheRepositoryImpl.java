package com.demoFirst_Spring_Project_023.repository.cache;

import com.demoFirst_Spring_Project_023.redis.RedisDetailsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.JedisPooled;

@Repository
public class CacheRepositoryImpl implements CacheRepository{

    @Autowired
    private JedisPooled jedisPooled;
    @Autowired
    private RedisDetailsConfig redisDetailsConfig;
    @Override
    public void createCacheEntity(String key, String value) {
        if (jedisPooled)

    }

    @Override
    public String getCacheEntity(String key) {
        return null;
    }

    @Override
    public void updateCacheEntity(String key, String value) {

    }

    @Override
    public void deleteCacheEntity(String key) {

    }

    @Override
    public Boolean isCacheEntityExists(String key) {
        return null;
    }
}
