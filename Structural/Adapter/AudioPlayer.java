// package Mediaplayer;

public class AudioPlayer implements MediaPlayer{
    public AudioPlayer(){
        super();
    }

    @Override
    public void play(String ext,String song){
        if(ext.equalsIgnoreCase("mp3")){
            System.out.println("Playing "+song+".mp3");
        }else{
            Adapter a = new Adapter(ext, song);
            a.play(ext, song);
        }
    }
}
