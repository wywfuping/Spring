package com.yawei.service;

import com.yawei.dao.LoginLogDao;
import com.yawei.dao.UserDao;
import com.yawei.exception.SendEmailException;
import com.yawei.exception.UserServiceException;
import com.yawei.pojo.LoginLog;
import com.yawei.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserService {
    @Inject
    private LoginLogDao loginLogDao;

    @Inject
    private UserDao userDao;

//    @Transactional
    public User login(String username, String password, String ip) {
        User user = userDao.findByUserName(username);

        if (user != null && user.getPassword().equals(password)) {
            loginLogDao.save(new LoginLog(user.getId(),ip));
            SendEmailException.sendEmail();

            return user;
        }else{

            throw new UserServiceException("账号或密码错误！");
        }
    }
}
