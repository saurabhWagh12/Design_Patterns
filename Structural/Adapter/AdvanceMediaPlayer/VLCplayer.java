package AdvanceMediaPlayer;

public class VLCplayer implements AdvanceMediaplayer{
    @Override
    public void playVLC(String song,String ext){
        System.out.println("VLC Player: "+"Playing "+song+"."+ext);
    }
    @Override
    public void playMP4(String song,String ext){
        System.out.println("Not Allowed");
    }
}
