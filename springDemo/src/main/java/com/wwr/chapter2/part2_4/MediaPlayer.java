package com.wwr.chapter2.part2_4;

public class MediaPlayer implements CDPlayer {

    private CompactDisc cd;
    public MediaPlayer(CompactDisc cd){
        this.cd=cd;
    }

    public void play() {
        cd.play();
    }
}
