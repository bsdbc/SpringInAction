package com.wwr.chapter4;

import org.springframework.stereotype.Component;

@Component("action1")
public class Action {

    public void perform(){
        System.out.println("biaoyan ..");
    }
}
