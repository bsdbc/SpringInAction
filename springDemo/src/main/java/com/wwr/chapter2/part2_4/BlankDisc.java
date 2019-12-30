package com.wwr.chapter2.part2_4;

import java.util.List;

public class BlankDisc implements CompactDisc{

    private String title;
    private String artist;
    private List<String> tracks;

    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for (String track:tracks){
            System.out.println(track);
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }
}
