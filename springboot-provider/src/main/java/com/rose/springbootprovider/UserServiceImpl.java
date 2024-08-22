package com.rose.springbootprovider;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;
import com.rose.lrpc.springboot.starter.annotation.RpcService;
import org.springframework.stereotype.Service;

@Service
@RpcService
public class UserServiceImpl  implements UserService {
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
