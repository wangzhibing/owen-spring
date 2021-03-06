/**
 * Copyright (c) 2015, 59store. All rights reserved.
 */
package com.owen.cloud.client.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * springcloud:eureka-service
 * @author owen
 */
@SpringBootApplication
public class ClientSubjectApplication extends SpringBootServletInitializer {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(DiscoveryApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(ClientSubjectApplication.class, args);
    }
}
