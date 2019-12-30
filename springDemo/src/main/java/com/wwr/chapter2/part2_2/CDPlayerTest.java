package com.wwr.chapter2.part2_2;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    //这里使用在set方法上添加
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull(){
        cd.play();
    }

    @Test
    public void play(){
        mediaPlayer.play();
    }

    @Autowired
    public void setMediaPlayer(MediaPlayer player){
        this.mediaPlayer=player;
    }
}
