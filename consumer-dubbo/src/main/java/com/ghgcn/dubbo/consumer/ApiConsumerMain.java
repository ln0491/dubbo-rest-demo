package com.ghgcn.dubbo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.annotation.Reference;

import com.ghgcn.dubbo.api.service.AnnoHelloService;

public class ApiConsumerMain {

    public static void main(String[] args) {
   
        ReferenceConfig<AnnoHelloService> referenceConfig  = new ReferenceConfig<AnnoHelloService>();
        
        
        referenceConfig.setApplication(new ApplicationConfig("java-api-test-consumer"));
        referenceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.230.128:2181"));
        referenceConfig.setInterface(AnnoHelloService.class);
        AnnoHelloService annoHelloService = referenceConfig.get();
        String helloAnno = annoHelloService.helloAnno();
        System.out.println(helloAnno+" 消费");

    }

}
