package com.ghgcn.dubbo.consumer.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ghgcn.dubbo.api.service.HelloService;
import com.ghgcn.dubbo.consumer.service.ICallHelloService;

@Service
public class CallHelloServiceImpl implements ICallHelloService {

    @Resource
    private HelloService helloService;
    
    @Override
    public String callHello(String name) {
        return helloService.hello(name);
    }

}
