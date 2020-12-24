package com.trial.dms.trialCode.test.testMethod.Redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * JedisPool连接池测试
 * JedisPool网络连接池是一个线程安全的，而Jedis单例进行连接是线程不安全的，
 * 可以在JedisPool连接池中创建Jedis实例，然后从连接池中取Jedis实例进行操作，会解决线程不安全的问题提高效率。
 * @author lx
 * @date 2020年12月24日
 */
public class JedisPoolUtil {
	
	private static JedisPool jedisPool = null;

	   static {
	        try {
	            JedisPoolConfig config = new JedisPoolConfig();
	            config.setMaxIdle(200);
	            config.setTestOnBorrow(true);
	            config.setMaxWaitMillis(10000);
	            //jedisPool = new JedisPool(config, "127.0.0.1", 6379, 10000, “password”);
	            jedisPool = new JedisPool(config, "127.0.0.1", 6379, 10000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static Jedis getJedis() {
	        if (jedisPool != null) {
	            Jedis jedis = jedisPool.getResource();
	            return jedis;
	        }
	        return null;
	    }

	    public static void close(Jedis jedis) {
	        if (jedis != null) {
	            jedis.close();
	        }
	    }
	    
	    public static void main(String[] args) {
	        //从连接池中获取jedis实例
	        Jedis jedis = JedisPoolUtil.getJedis();
	        jedis.set("k1", "v1");
	        // set 多个key 和 value
	        jedis.mset("k2", "v2", "k3", "v3", "k4", "v4");
	        System.out.println(jedis.get("k3"));
	        System.out.println(jedis.keys("*"));
	        // delete key
	        jedis.del("k2");
	        System.out.println(jedis.keys("*"));
	        JedisPoolUtil.close(jedis);
	    }

}
