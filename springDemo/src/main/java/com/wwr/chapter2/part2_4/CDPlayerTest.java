package com.wwr.chapter2.part2_4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:D:\\workspace\\springDemo\\src\\main\\java\\com\\wwr\\chapter2\\part2_4\\application.xml")
public class CDPlayerTest {
    @Resource(name = "blankPlayer")
    private CDPlayer cdPlayer;
    @Test
    public void playBlankDisc(){
        cdPlayer.play();
    }

}
