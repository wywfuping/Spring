package com.yawei.pojo;


import java.io.Serializable;
import java.sql.Time;

public class LoginLog implements Serializable{

    private static final long serialVersionUID = -3494845109021553780L;

    private Integer id;
    private Integer userid;
    private Time creattime;
    private String ip;

    public LoginLog() {
    }

    public LoginLog(Integer userid, String ip) {
        this.userid = userid;
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Time getCreattime() {
        return creattime;
    }

    public void setCreattime(Time creattime) {
        this.creattime = creattime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
                "id=" + id +
                ", userid=" + userid +
                ", creattime=" + creattime +
                ", ip='" + ip + '\'' +
                '}';
    }
}
