package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class UserController {

    @RequestMapping("/abc")
    public Animal getName(){
        return new Animal("dog",5);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("/abcd")

    public List<User> getUser(){
        return userService.findAll();
    }
}
