package com.owen.spring.boot.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.owen.spring.boot.web.pojo.dataobject.UserDO;
import com.owen.spring.boot.web.service.UserService;

/**
 * controller
 * @RestController
 * @author owen
 * Spring Boot应用中@RestController的Controller带有默认基于Jackson2的对象转JSON功能
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    
    @Autowired
    private UserService  userService;
    
    @RequestMapping("/queryUser")
    @ResponseBody
    public Object queryUser(Model mv){
        List<UserDO> list = userService.queryUser();
       // mv.addAttribute("list", list);
        return list;
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public Map<String, Object> test(Map<String, Object> model){
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("msg", "张三ss");     
        return m;
    }


}
