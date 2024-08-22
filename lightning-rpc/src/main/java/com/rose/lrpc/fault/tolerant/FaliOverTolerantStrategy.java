package com.rose.lrpc.fault.tolerant;

import com.rose.lrpc.model.RpcResponse;

import java.util.Map;

public class FaliOverTolerantStrategy implements TolerantStrategy{

    @Override
    public RpcResponse doTolerant(Map<String, Object> context, Exception e) {
        //TODO 扩展故障转移
        return null;
    }
}
