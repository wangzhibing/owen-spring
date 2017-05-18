package com.owen.spring.springboot.web.service.impll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owen.spring.springboot.web.mapper.UserMapper;
import com.owen.spring.springboot.web.pojo.dataobject.UserDO;
import com.owen.spring.springboot.web.service.UserService;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;

    public List<UserDO> queryUser() {
        return userMapper.selectUser();
    }

}
