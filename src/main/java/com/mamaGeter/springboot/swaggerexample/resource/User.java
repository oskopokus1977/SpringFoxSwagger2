package com.mamaGeter.springboot.swaggerexample.resource;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class User {
    @ApiModelProperty(notes = "name of user")
    private String name;
    @ApiModelProperty(notes = "password of user")
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
