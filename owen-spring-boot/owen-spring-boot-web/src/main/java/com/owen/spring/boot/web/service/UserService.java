package com.owen.spring.boot.web.service;

import java.util.List;

import com.owen.spring.boot.web.pojo.dataobject.UserDO;

public interface UserService {
    
    List<UserDO> queryUser();

}
