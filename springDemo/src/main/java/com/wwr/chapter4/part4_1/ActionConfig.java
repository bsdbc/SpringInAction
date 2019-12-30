package com.wwr.chapter4.part4_1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wwr.chapter4")
@EnableAspectJAutoProxy
public class ActionConfig {

}
