package com.yawei.dao;


import com.yawei.pojo.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    void delete(Integer id);
    void update(User user);

    User findById(Integer id);
    User findByUserName(String username);
    List<User> findAll();
    Long count();
}
