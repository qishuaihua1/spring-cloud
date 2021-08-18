package com.asiainfo.qish.springcloud.providerserver01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld(){
        return "this is hello one,server port:"+serverPort;
    }
}
