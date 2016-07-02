package com.yawei.service;

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
    public void testUserService() {
        User user = new User();

        user.setUsername("王卫");
        user.setPassword("789456");
        user.setAddress("china");

        userService.save(user);
    }
}
