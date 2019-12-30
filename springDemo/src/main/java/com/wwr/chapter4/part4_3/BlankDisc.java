package com.wwr.chapter4.part4_3;

import org.springframework.stereotype.Component;

import java.util.List;

public class BlankDisc {

    private List<String> tracks;

    public BlankDisc(List<String> tracks){
        this.tracks=tracks;
    }

    public void playTrack(int trackNumber){
        if(trackNumber<tracks.size()){
            System.out.println(tracks.get(trackNumber));
        }
    }
}
