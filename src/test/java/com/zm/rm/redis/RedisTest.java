/** 
 * Project Name:meeting_room 
 * File Name:RedisTest.java 
 * Package Name:com.zm.rm.redis 
 * Date:2019年8月9日下午5:13:00 
 * Copyright (c) 2019, www.bizwingroup.com All Rights Reserved. 
 * 
 */  
package com.zm.rm.redis;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import com.zm.mr.model.Role;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author zhangzhen
 */
//// 配置Spring中的测试环境
// @RunWith(SpringJUnit4ClassRunner.class)
//// 指定Spring的配置文件路径
// @ContextConfiguration(locations = { "classpath:spring.xml",
//// "classpath:spring-mvc.xml", "classpath:mybatis-config.xml",
// "classpath:mybatis-spring.xml" })
// @ContextConfiguration(locations = { "file:src/main/resources/spring.xml",
// "file:src/main/resources/spring-mvc.xml" })
// 测试类开启事务,需要指定事务管理器,默认测试完成后,数据库操作自动回滚
// @Transactional(transactionManager = "transactionManager")
// 指定数据库操作不回滚,可选
// @Rollback(value = false)
public class RedisTest extends UnitilsJUnit4 {

  @SpringApplicationContext({ "spring.xml", "mybatis-spring.xml", "spring-mvc.xml" })
  private ApplicationContext applicationContext;

  @SpringBean("redisTemplate")
  private RedisTemplate redisTemplate;

  @Test
  public void test1() {
    JedisPoolConfig config = new JedisPoolConfig();
    // 最大空闲数
    config.setMaxIdle(50);
    // 最大连接数
    config.setMaxTotal(100);
    // 最大等待毫秒数
    config.setMaxWaitMillis(20000);
    // 使用配置连接池
    JedisPool jedisPool = new JedisPool(config, "localhost");
    
    // Jedis jedis = new Jedis("localhost", 6379);
    Jedis jedis = jedisPool.getResource();
    int i = 0;
    try {
      long start = System.currentTimeMillis();
      while (true) {
        long end = System.currentTimeMillis();
        if (end - start >= 1000) {
          break;
        }
        i++;
        jedis.set("test" + i, i + "");
      }
    } finally {
      jedis.close();
      jedisPool.close();
    }
    System.out.println(i);
  }
  
  @Test
  public void redisPut() {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
    Role role = new Role();
    role.setRoleId(1);
    role.setRoleName("admin");
    redisTemplate.opsForValue().set("role_1", role);
    Role role2 = (Role) redisTemplate.opsForValue().get("role_1");
    System.out.println(role2.getRoleName());
  }

  public static void main(String[] args) {

    RedisTemplate redisTemplate = SpringUtils.getBean(RedisTemplate.class);
    Role role = new Role();
    role.setRoleId(1);
    role.setRoleName("admin");
    redisTemplate.opsForValue().set("role_1", role);
    Role role2 = (Role) redisTemplate.opsForValue().get("role_1");
    System.out.println(role2.getRoleName());
  }
}
