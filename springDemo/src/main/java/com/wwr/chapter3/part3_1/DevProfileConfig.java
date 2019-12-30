package com.wwr.chapter3.part3_1;

import com.wwr.chapter2.part2_4.BlankDisc;
import com.wwr.chapter2.part2_4.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Profile("dev")
public class DevProfileConfig {

    //开发环境我们播放BlankDisc
    @Bean
    public CompactDisc compactDisc(){
        BlankDisc blankDisc=new BlankDisc();
        blankDisc.setTitle("blankDisc");
        blankDisc.setArtist("Beyong");
        List<String> tracks=new ArrayList<String>();
        tracks.add("abcdefg");
        tracks.add("higklsn");
        tracks.add("opqrstu");
        tracks.add("uvwxyz");
        blankDisc.setTracks(tracks);
        return blankDisc;
    }


}
