package com.wwr.chapter3.part3_5;

import java.util.List;

public class Jukebox {

    private List<BlankDisc> songs;

    public Jukebox(List<BlankDisc> songs){
        this.songs=songs;
    }

    public List<BlankDisc> getSongs() {
        return songs;
    }

    public void setSongs(List<BlankDisc> songs) {
        this.songs = songs;
    }
}
