package com.wwr.chapter3.part3_1;

import com.wwr.chapter2.part2_4.CDPlayer;
import com.wwr.chapter2.part2_4.CompactDisc;
import com.wwr.chapter2.part2_4.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//这里不配置profile
@Import({ProdProfileConfig.class,DevProfileConfig.class})//引入所有的配置
public class CommConfig {

    @Autowired
    private CompactDisc cd;
    //多媒体播放器是必须的
    @Bean
    public CDPlayer cdPlayer(){
        return new MediaPlayer(cd);
    }
}
