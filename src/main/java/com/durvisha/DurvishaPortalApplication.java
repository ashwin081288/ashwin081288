package com.durvisha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync(proxyTargetClass = true)
@EnableCaching(proxyTargetClass = true, mode = AdviceMode.PROXY, order =1 )
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class DurvishaPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DurvishaPortalApplication.class, args);
	}



}
