package com.wwr.chapter4.part4_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.wwr.chapter4.part4_3")
@EnableAspectJAutoProxy
public class ActionConfig {

    @Bean
    public BlankDisc blankDisc(){
        List<String> tracks=new ArrayList<String>();
        tracks.add("111111");
        tracks.add("222222");
        tracks.add("333333");
        tracks.add("444444");
        tracks.add("555555");
        tracks.add("666666");
        tracks.add("777777");
        tracks.add("888888");

        return new BlankDisc(tracks);
    }
}
