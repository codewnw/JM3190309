package com.codewnw.jm3190309.spring.ioc.ioc04;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.codewnw.jm3190309.spring.ioc.ioc04")
@PropertySource("classpath:car.properties")
public class MySpringConfig {

}
