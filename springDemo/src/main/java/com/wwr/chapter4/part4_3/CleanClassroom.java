package com.wwr.chapter4.part4_3;

import org.springframework.stereotype.Component;

@Component
public class CleanClassroom implements Work {

    public void doWork() {
        System.out.println("打扫教室");
    }
}
