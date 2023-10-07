
public class Main {
    public static void main(String args[]){
        
        AudioPlayer ap = new AudioPlayer();
        ap.play("vlc", "Song1");
        ap.play("mp3", "Song2");
        ap.play("mp4", "Song3");

    }
}
