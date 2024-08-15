package com.rose.lrpc.registry;

import java.util.HashMap;
import java.util.Map;

public class LocalRegistry {

    private static final Map<String,Class<?>> map = new HashMap<>();

    /*
     * 注册服务
     */
    public static void register(String serviceName, Class<?>implClass){
        map.put(serviceName,implClass);
    }
    /*
     * 获取服务
     */
    public static Class<?> get(String serviceName){
        return map.get(serviceName);
    }
    /*
     * 移除服务
     */
    public static void remove(String serviceName){
        map.remove(serviceName);
    }
}
