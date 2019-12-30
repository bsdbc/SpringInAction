package com.wwr.chapter3.part3_5;

import org.springframework.beans.factory.annotation.Value;

public class BlankDisc {

    private String title;
    private String artist;

    public BlankDisc(String title, String artist){
        this.title=title;
        this.artist=artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
}
