package com.yawei.test;

import com.yawei.dao.UserDao;
import com.yawei.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTestCase {
    @Test
    public void testUserDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserService userService = (UserService) context.getBean("userService");
        userService.sayHi();

        /*UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.sayHello();*/
    }


}
