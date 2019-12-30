package com.wwr.chapter2.part2_4;

public class SpecialCDPlayer implements CDPlayer {

    private CompactDisc cd;
    public void play() {
        cd.play();
    }

    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }
}
