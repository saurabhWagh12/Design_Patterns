package AdvanceMediaPlayer;

public class MP4player implements AdvanceMediaplayer{
    @Override
    public void playVLC(String song,String ext){
        System.out.println("Not Allowed");
    }
    @Override
    public void playMP4(String song,String ext){
        System.out.println("MP4 Player: "+"Playing "+song+"."+ext);
    }
}
