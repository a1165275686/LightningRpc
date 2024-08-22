package com.rose.springbootconsumer;

import com.rose.example.common.model.User;
import com.rose.example.common.service.UserService;
import com.rose.lrpc.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl {
    /**
     * 使用 Rpc 框架注入
     */
    @RpcReference
    private UserService userService;

    /**
     * 测试方法
     */
    public void test() {
        User user = new User();
        user.setName("rose");
        User resultUser = userService.getUser(user);
        System.out.println(resultUser.getName());
    }
}
