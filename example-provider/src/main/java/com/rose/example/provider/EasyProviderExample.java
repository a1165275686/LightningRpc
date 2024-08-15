package com.rose.example.provider;

import com.rose.example.common.service.UserService;
import com.rose.lrpc.registry.LocalRegistry;
import com.rose.lrpc.server.HttpServer;
import com.rose.lrpc.server.VertxHttpServer;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 启动服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
