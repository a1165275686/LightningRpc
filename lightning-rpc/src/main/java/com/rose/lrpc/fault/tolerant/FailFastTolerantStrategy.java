package com.rose.lrpc.fault.tolerant;

import com.rose.lrpc.model.RpcResponse;

import java.util.Map;

public class FailFastTolerantStrategy implements TolerantStrategy{
    @Override
    public RpcResponse doTolerant(Map<String,Object> context,Exception e){
        throw new RuntimeException("服务报错",e);
    }
}
