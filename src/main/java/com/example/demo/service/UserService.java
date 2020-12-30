package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //把这东西加入到Spring的容器里（IOC）
public class UserService {

    @Autowired // 相当于实例化这东西
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
