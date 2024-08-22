package com.rose.lrpc.springboot.starter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableRpc {

    /**
     * 是否需要启动服务端
     * @return
     */
    boolean needServer() default true;
}
