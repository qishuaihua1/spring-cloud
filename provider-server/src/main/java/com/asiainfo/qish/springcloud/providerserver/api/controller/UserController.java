package com.asiainfo.qish.springcloud.providerserver.api.controller;

import com.asiainfo.qish.springcloud.providerserver.api.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping(value = "/user/queryUser/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User queryUserList(@PathVariable("id") Long id){
        User findOne = new User();
        if (id == 1) {
            findOne.setAge(20);
            findOne.setName("zhangsan");
            findOne.setUsername("zhangsan");
            findOne.setId(1L);
            findOne.setBalance(800D);
        } else {
            findOne.setAge(18);
            findOne.setName("lisi");
            findOne.setUsername("lisi");
            findOne.setId(2L);
            findOne.setBalance(2000D);
        }
        return findOne;
    }
}
