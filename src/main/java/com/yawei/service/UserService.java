package com.yawei.service;
import com.yawei.dao.UserDao;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {
    @Inject
    private UserDao userDao;

   /* public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void sayHi(){
        //System.out.println("你好你好……");
        userDao.sayHello();
    }

   /* public UserService(UserDao userDao){
        this.userDao=userDao;
    }*/
}
