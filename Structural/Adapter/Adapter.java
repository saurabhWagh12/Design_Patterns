import AdvanceMediaPlayer.AdvanceMediaplayer;
import AdvanceMediaPlayer.MP4player;
import AdvanceMediaPlayer.VLCplayer;

public class Adapter implements MediaPlayer{
    AdvanceMediaplayer amp;
    String ext,song;

    public Adapter(String ext,String song){
        this.ext = ext;
        this.song = song;
    }

    @Override
    public void play(String ext,String song){
        if(ext.equalsIgnoreCase("mp4")){
            this.amp = new MP4player();
            amp.playMP4(song,ext);
            amp = null;
        }else if(ext.equalsIgnoreCase("vlc")){
            this.amp = new VLCplayer();
            amp.playVLC(song,ext);
            amp = null;
        }else{
            System.out.println("Error can't play this type of song!!!");
        }
    }

}
