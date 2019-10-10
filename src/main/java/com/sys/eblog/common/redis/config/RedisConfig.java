/*
package com.sys.eblog.common.redis.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.lang.reflect.Method;

@Configuration
public class RedisConfig {  
	 @Bean
	    public KeyGenerator biliKeyGenerator(){
	        return new KeyGenerator() {
	            @Override  
	            public Object generate(Object target, Method method, Object... params) {  
	                StringBuilder sb = new StringBuilder();  
	                sb.append(target.getClass().getName());  
	                sb.append(method.getName());  
	                for (Object obj : params) {  
	                    sb.append(obj.toString());  
	                }  
	                return sb.toString();  
	            }  
	        };  
	  
	    }  
	    
	    @Bean
	    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {  
	        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();  
	        redisTemplate.setConnectionFactory(redisConnectionFactory);  
	        redisTemplate.setKeySerializer(new StringRedisSerializer());
	        redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
	        return redisTemplate;
	    } 
}*/
