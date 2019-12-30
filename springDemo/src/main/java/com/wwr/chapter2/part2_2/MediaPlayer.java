package com.wwr.chapter2.part2_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayer  {
    //给播放器放入CD
    private CompactDisc cd;

    //在构造方法上注入
    @Autowired
    public MediaPlayer(CompactDisc cd){
        this.cd=cd;
    }


    public void play(){
        cd.play();
    }
}
