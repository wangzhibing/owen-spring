package com.owen.cloud.client.instance.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class InstanceController {

    @Autowired
    DiscoveryClient client;

    @RequestMapping("/sentence")
    public String getSentence() {
        return getWord("eureka-client-subject") + " " + getWord("EUREKA-CLIENT-VERB") + ".";// 大小写不区分
//        return getWord("eureka-client-subject") + " " + getWord("EUREKA-CLIENT-VERB") + " " + getWord("eureka-client-article") + " "
//                + getWord("eureka-client-adjective") + " " + getWord("eureka-client-noun") + ".";// 大小写不区分
    }

    public String getWord(String service) {
        List<ServiceInstance> list = client.getInstances(service);
        if (list != null && list.size() > 0) {
            URI uri = list.get(0).getUri();
            if (uri != null) {
                return (new RestTemplate()).getForObject(uri, String.class);
            }
        }
        return null;
    }
}
