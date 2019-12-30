package com.wwr.chapter2.part2_2;

import org.springframework.stereotype.Component;

@Component("peppers")
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. pepper's Lonely Hearts Club Band";
    private String artist = "The Beaties";

    public void play() {
        System.out.println("Playing "+title+" by"+artist);
    }
}
