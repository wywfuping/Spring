package com.yawei.service;


import com.yawei.dao.UserDao;

public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHi(){
        System.out.println("你好你好……");

        userDao.sayHello();
    }
}
