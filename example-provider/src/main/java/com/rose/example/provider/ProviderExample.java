package com.rose.example.provider;

import com.rose.example.common.service.UserService;
import com.rose.lrpc.RpcApplication;
import com.rose.lrpc.registry.LocalRegistry;
import com.rose.lrpc.server.HttpServer;
import com.rose.lrpc.server.VertxHttpServer;

public class ProviderExample {
    public static void main(String[] args) {
        RpcApplication.init();

        LocalRegistry.register(UserService.class.getName(),UserService.class);

        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());


    }
}
