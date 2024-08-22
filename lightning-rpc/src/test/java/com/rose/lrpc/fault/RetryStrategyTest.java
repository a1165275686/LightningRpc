package com.rose.lrpc.fault;

import com.rose.lrpc.fault.retry.NoRetryStrategy;
import com.rose.lrpc.fault.retry.RetryStrategy;
import com.rose.lrpc.model.RpcResponse;
import org.junit.Test;

public class RetryStrategyTest {
    RetryStrategy  retryStrategy = new NoRetryStrategy();
    @Test
    public void doRetry(){
        try {
            RpcResponse rpcResponse = retryStrategy.doRetry(() -> {
                System.out.println("测试重试");
                throw new RuntimeException("模拟重试失败");
            });
            System.out.println(rpcResponse);
        }
 catch (Exception e){
     System.out.println("重试多次失败");
     e.printStackTrace();

        }
    }
}
