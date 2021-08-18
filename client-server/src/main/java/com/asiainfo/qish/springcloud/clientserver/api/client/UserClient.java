package com.asiainfo.qish.springcloud.clientserver.api.client;

import com.asiainfo.qish.springcloud.clientserver.api.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "provider-server",fallbackFactory  = FeignClientFallbackFactory.class)
public interface UserClient {
    @RequestMapping(value = "/user/queryUser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findById(@PathVariable("id") Long id);
}


@Component
class FeignClientFallbackFactory implements FallbackFactory<UserClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserClient create(Throwable cause) {
        return new UserClient() {
            @Override
            public User findById(Long id) {
                FeignClientFallbackFactory.LOGGER.info("fallback; reason was:", cause);
                User user = new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                user.setAge(0);
                user.setBalance((double) 0);
                return user;
            }
        };
    }
}