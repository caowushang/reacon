package com.xhx.reacon.repository;

import com.xhx.reacon.domain.ReaconDomainApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@Import(value = {ReaconDomainApplicationContext.class})
@ImportResource(locations = {"classpath:repository-bean.xml"})
public class ReaconRepositoryApplicationContext {
}
