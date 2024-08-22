package com.rose.lrpc.bootstrap;

import com.rose.lrpc.RpcApplication;

public class ConsumerBootStrap {

    /**
     * 初始化
     */
    public static void init() {
        // RPC 框架初始化（配置和注册中心）
        RpcApplication.init();
    }
}
