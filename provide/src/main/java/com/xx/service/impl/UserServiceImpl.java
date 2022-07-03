package com.xx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xx.service.UserService;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl  implements UserService {
    @Override
    public String sayHello() {
        return "hello,dubbo.....";
    }
}
