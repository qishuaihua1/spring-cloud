package com.asiainfo.qish.springcloud.feignserver.api.controller;

import com.asiainfo.qish.springcloud.feignserver.api.HelloServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloServerImpl helloServer;

    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return helloServer.helloServerFeign();
    }

}
