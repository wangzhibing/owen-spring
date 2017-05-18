package com.owen.spring.springboot.web.service;

import java.util.List;

import com.owen.spring.springboot.web.pojo.dataobject.UserDO;

public interface UserService {
    
    public List<UserDO> queryUser();

}
