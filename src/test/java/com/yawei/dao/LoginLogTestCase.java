package com.yawei.dao;
import com.yawei.pojo.LoginLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class LoginLogTestCase {
    @Inject
    private LoginLogDao loginLogDao;

    @Test
    public void testSave(){
        LoginLog loginLog = new LoginLog();
        loginLog.setIp("10.10.10.10");
        loginLog.setUserid(22);

        loginLogDao.save(loginLog);
    }
}
