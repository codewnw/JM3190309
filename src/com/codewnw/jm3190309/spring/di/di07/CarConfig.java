package com.codewnw.jm3190309.spring.di.di07;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.codewnw.jm3190309.spring.di.di07")
@PropertySource("classpath:car.properties")
public class CarConfig {

}
