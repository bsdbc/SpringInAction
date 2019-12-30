package com.wwr.chapter4.part4_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ActionConfig.class)
public class SpringTest {
    @Autowired
    private Action action;
    @Autowired
    private com.wwr.chapter4.Action action1;

    @Test
    public void play(){
        action.perform();
        action1.perform();
    }
}
