package com.yawei.service;

import com.yawei.dao.UserDao;
import com.yawei.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class UserServiceTestCase {
    @Inject
    private UserService userService;


    @Test
    public void testUserService(){
      userService.login("王石","456789","14.11.11.22");
    }
}
