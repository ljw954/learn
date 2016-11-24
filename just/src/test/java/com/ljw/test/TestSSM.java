package com.ljw.test;


import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ljw.dto.User;
import com.ljw.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class TestSSM {
	private static Logger logger = Logger.getLogger(TestSSM.class);  
	@Resource
	private UserService userService;
	@Test  
    public void test1() {  
        User user = userService.queryById(1);  
        System.out.println(user.getName());  
        logger.info("值："+user.getName());  
        logger.info(JSON.toJSONString(user));  
    }  
}
