package com.rose.lrpc.fault.retry;

import com.rose.lrpc.model.RpcResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;

@Slf4j
public class NoRetryStrategy implements RetryStrategy{
    @Override
    public RpcResponse doRetry(Callable<RpcResponse> callable)throws Exception {
        return callable.call();
    }
}
