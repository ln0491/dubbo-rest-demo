package com.ghgcn.dubbo.consumer.service.impl;

import javax.annotation.Resource;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import com.ghgcn.dubbo.api.service.AnnoHelloService;
import com.ghgcn.dubbo.api.service.HelloService;
import com.ghgcn.dubbo.consumer.service.ICallHelloService;

@Service
public class CallHelloServiceImpl implements ICallHelloService {

   // @Resource
    //private HelloService helloService;
    @Reference
    private AnnoHelloService annoHelloService;
    
    @Override
    public String callHello(String name) {
        //return helloService.hello(name);
        return "";
    }

    @Override
    public String callAnnoHello() {
        return annoHelloService.helloAnno();
    }

}
