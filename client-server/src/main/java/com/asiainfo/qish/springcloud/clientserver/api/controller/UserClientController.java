package com.asiainfo.qish.springcloud.clientserver.api.controller;

import com.asiainfo.qish.springcloud.clientserver.api.client.UserClient;
import com.asiainfo.qish.springcloud.clientserver.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserClientController {

    @Autowired
    private UserClient userClient;

    @RequestMapping(value = "/user/queryUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User queryUser(@PathVariable("id") Long id){
        return userClient.findById(id);
    }
}
