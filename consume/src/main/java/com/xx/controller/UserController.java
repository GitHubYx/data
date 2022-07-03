package com.xx.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.xx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private StringRedisTemplate template;

    @Reference
    UserService userService;

    @RequestMapping("hello")
    public String sayHello(){
        System.out.println("helle");
        String s = userService.sayHello();
        System.out.println(s);
        return userService.sayHello();

    }
    //http://localhost:8082/user/hello
}
