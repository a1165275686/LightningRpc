package com.rose.example.consumer;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;
import com.rose.lrpc.Proxy.ServiceProxyFactory;
import com.rose.lrpc.bootstrap.ConsumerBootStrap;

public class ConsumerExample {
    public static void main(String[] args) {

        //服务提供者初始化
        ConsumerBootStrap.init();
        //获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("rose");

        //调用服务
        User newUser = userService.getUser(user);
        if(newUser!=null){
            System.out.println(newUser.getName());
        }else{
            System.out.println("null");
        }
    }
}
