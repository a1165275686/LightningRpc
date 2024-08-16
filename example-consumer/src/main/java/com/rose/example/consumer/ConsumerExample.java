package com.rose.example.consumer;

import com.rose.lrpc.config.RpcConfig;
import com.rose.lrpc.utils.ConfigUtils;

public class ConsumerExample {
    public static void main(String[] args) {
        RpcConfig rpc  = ConfigUtils.loadConfig(RpcConfig.class,"rpc");
        System.out.println(rpc.getName());
        System.out.println(rpc.getVersion());
        System.out.println(rpc.getServerHost());
        System.out.println(rpc.getServerPort());

    }
}
