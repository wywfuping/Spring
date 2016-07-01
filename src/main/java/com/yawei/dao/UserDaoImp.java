package com.yawei.dao;

import com.yawei.pojo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UserDaoImp implements UserDao{
    @Inject
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(User user) {
        String sql="insert into t_user(username,address,password) values(?,?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getAddress(),user.getPassword());
    }

    @Override
    public void delete(Integer id) {
        String sql="DELETE FROM t_user WHERE id=?";
        jdbcTemplate.update(sql,id);
    }

    @Override
    public void update(User user) {
        String sql="update t_user set username=?,address=?,password=? where id=? ";
        jdbcTemplate.update(sql,user.getUsername(),user.getAddress(),user.getPassword(),user.getId());
    }

    @Override
    public User findById(Integer id) {
        String sql="select * from t_user where id=? ";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),id);
    }

    @Override
    public User findByUserName(String username) {
        String sql="select * from t_user where username=? ";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),username);
    }

    @Override
    public List<User> findAll() {
        String sql="select * from t_user ";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public Long count() {
        String sql="select count(*) from t_user";
        return jdbcTemplate.queryForObject(sql,new SingleColumnRowMapper<Long>());
    }
}
