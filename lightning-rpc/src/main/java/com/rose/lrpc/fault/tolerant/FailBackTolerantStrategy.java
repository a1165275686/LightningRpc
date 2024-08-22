package com.rose.lrpc.fault.tolerant;

import com.rose.lrpc.model.RpcResponse;

import java.util.Map;

public class FailBackTolerantStrategy implements TolerantStrategy{
    @Override
    public RpcResponse doTolerant(Map<String, Object> context, Exception e) {
        try{
            //重试
            return (RpcResponse) context.get("rpcResponse");
        }catch (RuntimeException est){
            return Fallback(context,est);
        }
    }

    public RpcResponse Fallback(Map<String, Object> context, Exception e){
        return new RpcResponse();
    }
}
