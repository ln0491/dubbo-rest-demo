package com.ghgcn.dubbo.provider.service.impl;

import java.time.LocalDateTime;

import org.apache.dubbo.config.annotation.Service;

import com.ghgcn.dubbo.api.service.AnnoHelloService;

public class AnnoHelloServiceImpl implements AnnoHelloService {

    @Override
    public String helloAnno() {
        return "hello anno "+ LocalDateTime.now();
    }

}
