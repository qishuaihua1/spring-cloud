package com.asiainfo.qish.springcloud.feignserver.api;

import com.asiainfo.qish.springcloud.feignserver.api.controller.FeignFallBackHello;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 定义一个feign接口，通过@FeignClient（“服务名”），来指定调用哪个服务。
 * 比如在代码中调用了provider-server-01服务的“/hello”接口
 * */

@FeignClient(value = "provider-server-01",fallback = FeignFallBackHello.class)
public interface HelloServerImpl {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String helloServerFeign();
}