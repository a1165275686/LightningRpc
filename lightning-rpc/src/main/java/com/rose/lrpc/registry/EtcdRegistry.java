package com.rose.lrpc.registry;

import io.etcd.jetcd.ByteSequence;
import io.etcd.jetcd.Client;
import io.etcd.jetcd.KV;
import io.etcd.jetcd.kv.GetResponse;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class EtcdRegistry {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        Client client = Client.builder().endpoints("http://localhost:2379").build();
        KV kvclient =  client.getKVClient();
        ByteSequence key = ByteSequence.from("test_key".getBytes());
        ByteSequence value = ByteSequence.from("test_value".getBytes());

        kvclient.put(key,value).get();

        CompletableFuture<GetResponse> getFuture = kvclient.get(key);

        GetResponse response = getFuture.get();

        kvclient.delete(key).get();

    }
}
