package com.wwr.chapter2.part2_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
    @Bean //简单的bean声明
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new MediaPlayer(cd);
    }
    @Bean
    public CDPlayer anthorCdPlayer(){
        return new MediaPlayer(sgtPeppers());
    }
}
