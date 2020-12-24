package com.trial.dms.trialCode.test.testMethod.Redis;

import redis.clients.jedis.Jedis;

/**
 * 单例连接测试
 * @author lx
 * @date 2020年12月24日
 */
public class RedisSingleTest {
	
	public static void main(String[] args) {
		// 1.new Jedis 对象填写ip和端口号
		Jedis jedis = new Jedis("127.0.0.1",6379);
		// 如果设置了密码，需要认证
		//jedis.auth("password");
		// 2. 测试是否可以ping通
		System.out.println(jedis.ping());
	}
}
