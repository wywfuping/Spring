package com.yawei.mapper;
import com.yawei.pojo.LoginLog;
import java.util.List;

public interface LoginLogMapper {
    List<LoginLog> findByUserId(Integer userid);
}
