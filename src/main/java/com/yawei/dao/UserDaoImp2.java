package com.yawei.dao;

import javax.inject.Named;

@Named
public class UserDaoImp2 implements UserDao{

    @Override
    public void sayHello() {
        System.out.println("come on baby~~~~~");
    }
}
