package com.wwr.chapter3.part3_5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveTest {
    @Autowired
    private BlankDisc disc;

    @Value("#{jukebox.songs.?[artist eq 'cc']}")
    private List<BlankDisc> list;

    @Test
    public void isNotNull(){
        assert(disc!=null);
        System.out.println(disc.getTitle());
        System.out.println(disc.getArtist());

    }
    @Test
    public void printList(){
        for (BlankDisc disc:list){
            System.out.println("Artist>>"+disc.getArtist());
            System.out.println("Title>>"+disc.getTitle());
        }
    }

}
