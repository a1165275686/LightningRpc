package com.rose.example.provider;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getUser(User user){
        System.out.println("用户名"+ user.getName());
        return user;
    }
}
