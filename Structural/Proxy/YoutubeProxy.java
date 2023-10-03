public class YoutubeProxy implements Video{
    private Youtube yt;
    public YoutubeProxy(String video){
       this.yt = new Youtube(video);
    }

     public void login(){
        this.yt.login(true);
    }

    public void logout(){
        this.yt.login(false);
    }

    @Override
    public void play() {
        if(yt.loggedIn){
            yt.play();
        }else{
            System.out.println("Please Login First");
        } 
    } 

}
