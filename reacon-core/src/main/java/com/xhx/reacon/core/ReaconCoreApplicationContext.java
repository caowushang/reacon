package com.xhx.reacon.core;

import com.xhx.reacon.repository.ReaconRepositoryApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(value = ReaconRepositoryApplicationContext.class)
public class ReaconCoreApplicationContext {
}
