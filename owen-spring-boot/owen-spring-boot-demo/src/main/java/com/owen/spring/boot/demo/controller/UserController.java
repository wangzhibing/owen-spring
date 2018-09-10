package com.owen.spring.boot.demo.controller;

import com.mountain.persistent.core.example.Example;
import com.owen.spring.boot.demo.dao.entity.User;
import com.owen.spring.boot.demo.dao.entity.example.UserExample;
import com.owen.spring.boot.demo.service.atom.UserAtom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory
            .getLogger(UserController.class);

    @Resource
    private UserAtom userAtom;

    /**
     * @param
     * @return
     */
    @RequestMapping(value = "/initData", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> initData() {
        Map<String, Object> m = new HashMap<String, Object>();
        System.out.println(new Date());
        m.put("date", new Date());
        return m;
    }

    @RequestMapping("/queryUser")
    @ResponseBody
    public Object queryUser(Model mv) {
        UserExample userExample = new UserExample();
        List<User> list = userAtom.queryList(userExample);
        return list;
    }

}
