package com.asiainfo.qish.springcloud.consumerserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(){
        return restTemplate.getForEntity("http://provider-server/hello",String.class).getBody();
    }
}
