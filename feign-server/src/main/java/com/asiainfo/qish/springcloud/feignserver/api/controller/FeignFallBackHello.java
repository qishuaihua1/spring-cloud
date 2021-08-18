package com.asiainfo.qish.springcloud.feignserver.api.controller;

import com.asiainfo.qish.springcloud.feignserver.api.HelloServerImpl;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBackHello implements HelloServerImpl {
    @Override
    public String helloServerFeign() {
        return "sorry this is an error!!!";
    }
}
