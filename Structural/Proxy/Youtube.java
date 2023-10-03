public class Youtube implements Video{
    boolean loggedIn = false;
    String video;
    public Youtube(String video){
        this.video = video;
    } 

    public void login(boolean t){
        this.loggedIn = t;
    }

    @Override 
    public void play(){
        System.out.println("Playing Video");
    }
}
