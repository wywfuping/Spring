package com.yawei.service;


import com.yawei.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class BookService {
    private String bookname;
    private Integer num;
    private List<String> lists;
    private Set<String> sets;
    private Map<String,Object> maps;
    private Properties properties;
    private UserDao userDao;

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void showBook(){
        System.out.println("BookService{" +
                "bookname='" + bookname + '\'' +
                ", num=" + num +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", properties=" + properties +
                ", userDao=" + userDao +
                '}');
    }

}
