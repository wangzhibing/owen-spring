package com.owen.cloud.client.adjective.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdjectiveController {
    
    @Value("${words}")
    private String words;
    
    
    @RequestMapping("/")
    public String getWord(){
        String[] wordArray = words.split(",");
        int i = (int)Math.round(Math.random() * (wordArray.length -1));
        return wordArray[i];
    }
    

}
