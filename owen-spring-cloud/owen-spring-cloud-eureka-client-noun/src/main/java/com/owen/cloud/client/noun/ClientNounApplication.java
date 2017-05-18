/**
s * Copyright (c) 2015, 59store. All rights reserved.
 */
package com.owen.cloud.client.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * springcloud:eureka-service
 * @author owen
 */
@SpringBootApplication
@EnableEurekaClient
public class ClientNounApplication extends SpringBootServletInitializer {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(DiscoveryApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(ClientNounApplication.class, args);
    }
}
