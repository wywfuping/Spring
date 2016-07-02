package com.yawei.service;

import com.yawei.mapper.LoginLogMapper;
import com.yawei.mapper.UserMapper;
import com.yawei.pojo.LoginLog;
import com.yawei.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class UserService {
    @Inject
    private UserMapper userMapper;

    @Inject
    private LoginLogMapper loginLogMapper;

    public void save(User user) {
        userMapper.save(user);
    }

    public void findById(Integer id){
        userMapper.findById(id);
    }

    public List<LoginLog> findByUserId(Integer userid){
        return loginLogMapper.findByUserId(userid);
    }
}
