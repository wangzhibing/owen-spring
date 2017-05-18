package com.owen.spring.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * controller
 * @RestController
 * @author owen
 * Spring Boot应用中@RestController的Controller带有默认基于Jackson2的对象转JSON功能
 */
@Controller
@RequestMapping("/myUserController")
public class MyUserController {
    
//    @RequestMapping("/thing")
//    public MyThing thing() {
//            return new MyThing();
//    }

}
