package com.ghgcn.dubbo.provider;

import java.io.IOException;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import com.ghgcn.dubbo.api.service.AnnoHelloService;
import com.ghgcn.dubbo.provider.service.impl.AnnoHelloServiceImpl;

public class ApiApplicationMain {

    public static void main(String[] args) throws IOException {

        ServiceConfig<AnnoHelloService> serviceConfig = new ServiceConfig<AnnoHelloService>();
        serviceConfig.setApplication(new ApplicationConfig("java-api-test-provider"));
        serviceConfig.setRegistry(new RegistryConfig("zookeeper://192.168.230.128:2181"));
        serviceConfig.setProtocol(new ProtocolConfig("dubbo", 9898));
        serviceConfig.setInterface(AnnoHelloService.class);
        serviceConfig.setRef(new AnnoHelloServiceImpl());
        serviceConfig.export();
        System.out.println("服务启了");
        System.in.read();
    }

}
