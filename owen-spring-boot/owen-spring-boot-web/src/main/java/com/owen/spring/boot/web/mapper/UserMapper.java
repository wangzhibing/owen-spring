package com.owen.spring.boot.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.owen.spring.boot.web.pojo.dataobject.UserDO;

@Repository
public interface UserMapper {

    public List<UserDO> selectUser();
}
