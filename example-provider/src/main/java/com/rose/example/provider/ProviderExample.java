package com.rose.example.provider;

import com.rose.example.common.service.UserService;
import com.rose.lrpc.RpcApplication;
import com.rose.lrpc.config.RegistryConfig;
import com.rose.lrpc.config.RpcConfig;
import com.rose.lrpc.model.ServiceMetaInfo;
import com.rose.lrpc.registry.LocalRegistry;
import com.rose.lrpc.registry.Registry;
import com.rose.lrpc.registry.RegistryFactory;
import com.rose.lrpc.server.tcp.VertxTcpServer;

public class ProviderExample {
    public static void main(String[] args) {
        // RPC 框架初始化
        RpcApplication.init();

        // 注册服务
        String serviceName = UserService.class.getName();
        LocalRegistry.register(serviceName, UserServiceImpl.class);

        // 注册服务到注册中心
        RpcConfig rpcConfig = RpcApplication.getRpcConfig();
        RegistryConfig registryConfig = rpcConfig.getRegistryConfig();
        Registry registry = RegistryFactory.getInstance(registryConfig.getRegistry());
        ServiceMetaInfo serviceMetaInfo = new ServiceMetaInfo();
        serviceMetaInfo.setServiceName(serviceName);
        serviceMetaInfo.setServiceHost(rpcConfig.getServerHost());
        serviceMetaInfo.setServicePort(rpcConfig.getServerPort());
        try {
            registry.register(serviceMetaInfo);
        } catch (
                Exception e) {
            throw new RuntimeException(e);
        }

        // 启动 TCP 服务
        VertxTcpServer vertxTcpServer = new VertxTcpServer();
        vertxTcpServer.doStart(8080);
    }
}