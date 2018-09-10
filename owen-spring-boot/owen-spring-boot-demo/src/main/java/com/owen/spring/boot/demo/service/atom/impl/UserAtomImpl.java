package com.owen.spring.boot.demo.service.atom.impl;

import com.mountain.atombase.SimpleTableService;
import com.mountain.persistent.core.persistence.BaseMapper;
import com.owen.spring.boot.demo.dao.entity.User;
import com.owen.spring.boot.demo.dao.mapper.UserMapper;
import com.owen.spring.boot.demo.service.atom.UserAtom;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAtomImpl extends SimpleTableService<User> implements UserAtom {
    @Resource
    private UserMapper slaveUserMapper;

    @Resource
    private UserMapper masterUserMapper;

    @Override
    protected BaseMapper<User> getBaseSlaveMapper() {
        return this.slaveUserMapper;
    }

    @Override
    protected BaseMapper<User> getBaseMasterMapper() {
        return this.masterUserMapper;
    }
}
