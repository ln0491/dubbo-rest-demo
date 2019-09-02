package com.ghgcn.dubbo.provider.service.impl;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.ghgcn.dubbo.api.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {

        return "hello "+ name + LocalDate.now();
    }

}
