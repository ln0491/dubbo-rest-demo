package com.ghgcn.dubbo.consumer;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ghgcn.dubbo.consumer.service.ICallHelloService;

public class Application {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "spring/spring.xml","spring/dubbo-client.xml"
        });

        context.start();
        ICallHelloService callHelloService = context.getBean(ICallHelloService.class); // get remote service

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(callHelloService.callHello("刘楠* " + new Date()));
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }

        }

    }

}
