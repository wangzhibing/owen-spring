package com.owen.cloud.client.verb.rpc.impl;

import com.owen.cloud.client.verb.rpc.VerbDTO;
import com.owen.cloud.client.verb.rpc.VerbRemoteService;

public class VerbRemoteServiceImpl implements VerbRemoteService{

    @Override
    public VerbDTO queryVerbInfo(String codeId) {
        System.out.println("codeId:"+codeId);
        return new VerbDTO("Hello", "123456");
    }

}
