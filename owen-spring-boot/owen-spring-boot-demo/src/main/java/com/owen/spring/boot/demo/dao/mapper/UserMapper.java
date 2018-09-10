package com.owen.spring.boot.demo.dao.mapper;

import com.mountain.persistent.core.persistence.BaseMapper;
import com.owen.spring.boot.demo.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

     List<User> selectUser();
}
