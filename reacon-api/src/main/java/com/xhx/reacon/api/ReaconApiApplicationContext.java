package com.xhx.reacon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
//@Import(value = {})
//@ImportResource(value = "dubbo-provider.xml")
@EnableCaching
public class ReaconApiApplicationContext {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ReaconApiApplicationContext.class, args);
    }
}
