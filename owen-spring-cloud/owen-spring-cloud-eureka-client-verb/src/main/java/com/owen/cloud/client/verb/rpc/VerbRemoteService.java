package com.owen.cloud.client.verb.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="verbRemoteService")
public interface VerbRemoteService {

    @RequestMapping(value = "/code/{codeId}", method = RequestMethod.GET)
    public VerbDTO queryVerbInfo(@PathVariable("codeId") String codeId);
}
