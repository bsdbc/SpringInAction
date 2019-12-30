package com.wwr.chapter3.part3_2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class ConditionTest {
    @Autowired(required = false)
    private MagicBean magicBean;
    @Test
    public void magicBeanIsNull(){
        assert(magicBean==null);
    }



}
