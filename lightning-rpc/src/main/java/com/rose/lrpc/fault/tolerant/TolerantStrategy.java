package com.rose.lrpc.fault.tolerant;

import com.rose.lrpc.model.RpcResponse;

import java.util.Map;

public interface TolerantStrategy {

    /**
     * 容错
     * @param context  上下文
     * @param e
     * @return
     */
    RpcResponse doTolerant(Map<String,Object>context,Exception e );

}
