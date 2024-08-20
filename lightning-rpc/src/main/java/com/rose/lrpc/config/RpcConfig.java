package com.rose.lrpc.config;

import lombok.Data;

@Data
public class RpcConfig {


    /**
     * 序列化器
     */
    private String serializer = "SerializerKeys.JDK";
    /**
     * 是否启用mock
     */
    private boolean mock = false;
    /**
     * 服务名称
     */
    private String name = "lightning-rpc";

    /**
     * 服务版本
     */
    private String version = "1.0";
    /**
     * 服务端地址
     */
    private String serverHost = "localhost";

    /**
     * 服务端端口
     */
    private Integer serverPort = 8080;

}
