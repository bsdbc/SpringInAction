package com.wwr.chapter2.part2_2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.wwr.chapter2")
@ComponentScan(basePackageClasses = {CompactDisc.class,CDPlayerTest.class})
public class CDPlayerConfig {
}
