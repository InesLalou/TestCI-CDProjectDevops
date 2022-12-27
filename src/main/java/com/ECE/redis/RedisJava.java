package com.ECE.redis;
import redis.clients.jedis.Jedis;

public class RedisJava {

    Jedis jedis;
    //DeepThought super_computer;
  
    public RedisJava(){
        this.jedis = new Jedis("localhost", 9292);
    }

    public void cache_value(String key, String value){
        this.jedis.set(key, value);
        this.jedis.close();
    }

    public String get_cached_value(String key){
        return this.jedis.get(key);
        this.jedis.close();
    }

}
