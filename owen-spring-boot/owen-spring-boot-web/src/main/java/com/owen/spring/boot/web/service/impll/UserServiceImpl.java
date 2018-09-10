package com.owen.spring.boot.web.service.impll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.stereotype.Service;

import com.owen.spring.boot.web.mapper.UserMapper;
import com.owen.spring.boot.web.pojo.dataobject.UserDO;
import com.owen.spring.boot.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDO> queryUser() {
        return userMapper.selectUser();
    }

}
