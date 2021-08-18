package com.asiainfo.qish.springcloud.consumerserver.controller;

import com.asiainfo.qish.springcloud.consumerserver.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/consumer", method = RequestMethod.GET)
    @ResponseBody
    public String helloConsumer() {
        return helloService.helloService();
    }
}
