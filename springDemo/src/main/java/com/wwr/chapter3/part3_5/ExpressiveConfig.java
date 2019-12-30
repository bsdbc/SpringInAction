package com.wwr.chapter3.part3_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;

@Configuration
@PropertySource("classpath:/app.properties") //classpath:编译目录下classes目录
public class ExpressiveConfig {
    @Autowired
    private Environment env;
    @Bean
    public BlankDisc disc(){

        return new BlankDisc(env.getProperty("disc.title"),env.getProperty("disc.artist"));
    }
    @Bean
    public Jukebox jukebox(){

        ArrayList<BlankDisc> songs = new ArrayList<BlankDisc>();
        songs.add(new BlankDisc("aa","aa"));
        songs.add(new BlankDisc("bb","bb"));
        songs.add(new BlankDisc("cc","cc"));
        songs.add(new BlankDisc("dd","dd"));
        songs.add(new BlankDisc("ee","ee"));
        songs.add(new BlankDisc("ff","ff"));
        return new Jukebox(songs);
    }
}
