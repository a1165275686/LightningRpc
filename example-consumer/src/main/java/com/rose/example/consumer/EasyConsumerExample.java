package com.rose.example.consumer;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;
import com.rose.lrpc.Proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {

        UserService userService  = ServiceProxyFactory.getProxy(UserService.class);
        User user =  new User();
        user.setName("rose");

        User newUser = userService.getUser(user);
        if(newUser != null){
            System.out.println(newUser.getName());
        }else{
            System.out.println("user is null");
        }
    }
}
