package com.owen.spring.boot.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * JSP
 * @author owen
 *
 */
@RequestMapping("jspController")
public class JspController {
    
    
    @RequestMapping("/a")
    public String b(Map<String, Object> model){
        model.put("msg", "张三");     
        return "regiester";
    }

    @RequestMapping("/b")
    public ModelAndView b(HttpServletRequest request){
        ModelAndView view = new ModelAndView();
        view.setViewName("regiester");

        request.setAttribute("msg", "Davie");
        return view;
    }

}
