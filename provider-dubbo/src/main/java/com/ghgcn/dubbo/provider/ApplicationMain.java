package com.ghgcn.dubbo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationMain {
    
    private static Logger logger = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) {

        org.apache.dubbo.container.Main.main(args);
        
        logger.info("dubbo-provider starting");
        
    }

}
