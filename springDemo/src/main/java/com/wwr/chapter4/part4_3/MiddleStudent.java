package com.wwr.chapter4.part4_3;

import org.springframework.stereotype.Component;

@Component
public class MiddleStudent implements Student {

    public void study() {
        System.out.println("学生应该学习。。");
    }

}
