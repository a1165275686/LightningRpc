package com.rose.lrpc.springboot.starter.annotation;

import com.rose.lrpc.springboot.starter.bootstrap.RpcConsumerBootstrap;
import com.rose.lrpc.springboot.starter.bootstrap.RpcInitBootstrap;
import com.rose.lrpc.springboot.starter.bootstrap.RpcProviderBootstrap;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({RpcInitBootstrap.class, RpcProviderBootstrap.class, RpcConsumerBootstrap.class})
public @interface EnableRpc {

    /**
     * 是否需要启动服务端
     * @return
     */
    boolean needServer() default true;
}
