package com.mamaGeter.springboot.swaggerexample.resource.controller;


import com.mamaGeter.springboot.swaggerexample.resource.model.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/user")
@Api(value = "User Resource REST Endpoint", description = "Shows thr user info")
public class UserResource {

    @GetMapping
    public List<User>gerUsers(){
        return Arrays.asList(new User("Yurii","1111"),
                new User("Oleg","2222"));
    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") final String userName){
        return new User(userName, "0000");
    }
}
