package com.owen.spring.springboot.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.owen.spring.springboot.web.pojo.dataobject.UserDO;

@Repository
public interface UserMapper {

    public List<UserDO> selectUser();
}
