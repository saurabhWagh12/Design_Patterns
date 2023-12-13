public class Youtube implements Video{
    boolean loggedIn = false;
    String video;
    int count;
    public Youtube(String video){
        this.video = video;
        this.count = 0;
    } 

    public void login(boolean t){
        this.loggedIn = t;
    }

    @Override 
    public void play(){
        System.out.println("Playing Video: "+this.video);
    }
}
