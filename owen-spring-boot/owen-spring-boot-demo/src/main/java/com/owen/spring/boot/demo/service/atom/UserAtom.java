package com.owen.spring.boot.demo.service.atom;


import com.mountain.atombase.api.IColsTableQueryService;
import com.mountain.atombase.api.ISimpleTableService;
import com.mountain.atombase.api.ISumTableQueryService;
import com.owen.spring.boot.demo.dao.entity.User;

public interface UserAtom extends ISimpleTableService<User>, ISumTableQueryService<User>, IColsTableQueryService<User> {
}
