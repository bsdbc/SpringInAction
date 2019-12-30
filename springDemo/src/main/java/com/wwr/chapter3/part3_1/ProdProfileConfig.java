package com.wwr.chapter3.part3_1;

import com.wwr.chapter2.part2_4.CompactDisc;
import com.wwr.chapter2.part2_4.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdProfileConfig {

    //生产环境我们使用更加稳定的sgtPeppers
    @Bean
    public CompactDisc compactDisc(){

        return new SgtPeppers();
    }
}
