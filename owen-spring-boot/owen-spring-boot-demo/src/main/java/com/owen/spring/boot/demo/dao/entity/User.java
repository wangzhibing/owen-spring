package com.owen.spring.boot.demo.dao.entity;

import com.mountain.persistent.api.pojo.instance.BaseEntity;

import javax.persistence.Table;

@Table(name = "user_info")
public class User extends BaseEntity {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
