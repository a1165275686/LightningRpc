package com.rose.springbootprovider;

import com.rose.lrpc.springboot.starter.annotation.EnableRpc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRpc
public class SpringbootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProviderApplication.class, args);
    }

}
