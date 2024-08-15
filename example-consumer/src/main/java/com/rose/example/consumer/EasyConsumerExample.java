package com.rose.example.consumer;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;

public class EasyConsumerExample {
    public static void main(String[] args) {

        UserService userService  = new UserServiceProxy();
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
