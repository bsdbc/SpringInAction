package com.wwr.chapter3.part3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){

        return new MagicBean();
    }
}
