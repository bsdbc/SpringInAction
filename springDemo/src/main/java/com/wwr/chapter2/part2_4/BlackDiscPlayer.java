package com.wwr.chapter2.part2_4;

public class BlackDiscPlayer implements CDPlayer {

    private BlankDisc cd;

    public void play() {
        cd.play();
    }

    public void setCd(BlankDisc cd) {
        this.cd = cd;
    }
}
