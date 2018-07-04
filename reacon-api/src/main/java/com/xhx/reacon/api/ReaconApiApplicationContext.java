package com.xhx.reacon.api;

import com.xhx.reacon.core.ReaconCoreApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

@SpringBootApplication
@EnableAspectJAutoProxy
@EnableScheduling
@Import(value = {ReaconCoreApplicationContext.class})
@EnableCaching
public class ReaconApiApplicationContext {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ReaconApiApplicationContext.class, args);
    }

    @Bean
    public ExceptionHandlerExceptionResolver exceptionHandlerExceptionResolver() {
        return new ExceptionHandlerExceptionResolver();
    }
}
