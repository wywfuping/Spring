package com.yawei.dao;

import javax.inject.Named;

@Named
public class UserDaoImp1 implements UserDao{

    @Override
    public void sayHello() {
        System.out.println("哈哈哈哈");
       /* if(true){
            throw new RuntimeException("此处出现异常~~~~~~~~~~~~");
        }*/
    }
}
