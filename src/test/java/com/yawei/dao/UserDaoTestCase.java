package com.yawei.dao;

import com.yawei.dao.UserDao;
import com.yawei.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class UserDaoTestCase {
    @Inject
    private UserDao userDao;

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("王石");
        user.setAddress("中国");
        user.setPassword("456789");

        userDao.save(user);
    }

    @Test
    public void testFindById() {
        User user = userDao.findById(1);
        Assert.assertNotNull(user);
        System.out.println(user);
    }

    @Test
    public void testUpdate() {
        User user = userDao.findById(1);
        user.setAddress("中国");
        user.setPassword("1237898");
        userDao.update(user);
    }

    @Test
    public void tesFindByUserName() {
        User user = userDao.findByUserName("王石");
        Assert.assertNotNull(user);
        System.out.println(user);
    }

    @Test
    public void testFindAll(){
        List<User> userList = userDao.findAll();
        Assert.assertEquals(userList.size(),6);
        System.out.println(userList);
    }

    @Test
    public void testCount(){
        Long count = userDao.count();
        Assert.assertEquals(count.intValue(),6);
        System.out.println(count);
    }
}
