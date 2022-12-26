import redis.clients.jedis.Jedis;

public class RedisJavaz {

    Jedis jedis;
    
    public RedisJavaz(){
        this.jedis = new Jedis("localhost", 8282);
    }

    public void cache_value(String key, String value){
        this.jedis.set(key, value);
    }

    public String get_cached_value(String key){
        return this.jedis.get(key);
    }

}
