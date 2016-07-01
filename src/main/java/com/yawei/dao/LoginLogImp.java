package com.yawei.dao;

import com.yawei.pojo.LoginLog;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class LoginLogImp implements LoginLogDao{
    @Inject
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(LoginLog loginLog) {
        String sql = "insert into t_loginlog(ip,userid) values(?,?)";
        jdbcTemplate.update(sql,loginLog.getIp(),loginLog.getUserid());
    }
}
