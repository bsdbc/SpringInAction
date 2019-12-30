package com.wwr.chapter2.part2_3;


public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. pepper's Lonely Hearts Club Band";
    private String artist = "The Beaties";

    public void play() {
        System.out.println("Playing "+title+" by"+artist);
    }
}
