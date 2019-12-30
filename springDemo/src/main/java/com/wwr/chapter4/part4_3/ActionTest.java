package com.wwr.chapter4.part4_3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ActionConfig.class)
public class ActionTest {
    @Autowired
    private Action action;
    @Autowired
    private BlankDisc blankDisc;
    @Autowired
    private TrackCounter trackCounter;
    @Autowired
    private Student student;
    @Test
    public void play(){
        action.perform();
    }
    @Test
    public void cdPlay(){
        blankDisc.playTrack(1);
        blankDisc.playTrack(2);
        blankDisc.playTrack(3);
        blankDisc.playTrack(3);
        blankDisc.playTrack(3);
        blankDisc.playTrack(3);
        blankDisc.playTrack(7);
        blankDisc.playTrack(7);

        assert(1==trackCounter.getPlayCount(1));
        assert(1==trackCounter.getPlayCount(2));
        assert(4==trackCounter.getPlayCount(3));
        assert(0==trackCounter.getPlayCount(4));
        assert(0==trackCounter.getPlayCount(5));
        assert(0==trackCounter.getPlayCount(6));
        assert(2==trackCounter.getPlayCount(7));
    }

    @Test
    public void studentDialy(){
        student.study();
        Work work=(Work)student;

        work.doWork();
    }

}
