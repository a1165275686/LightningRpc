package com.rose.lrpc.loadbalancer;

public interface LoadBalanceKeys {
    /**
     * 轮询
     */
    String ROUND_ROBIN = "roundRobin";

    /**
     * 随机选择
     */
    String RANDOM = "random";

    /**
     * 一致性哈希
     */
    String CONSISTENT_HASH = "consistentHash";

}
