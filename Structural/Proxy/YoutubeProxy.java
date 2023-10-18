public class YoutubeProxy implements Video{
    private Youtube yt;
    public YoutubeProxy(String video){
       this.yt = new Youtube(video);
    }

     public void login(){
        this.yt.login(true);
        this.yt.count++;
    }

    public void logout(){
        this.yt.login(false);
    }

    @Override
    public void play() {

        if(yt.count>=5){
            System.out.println("Maximum limit exhausted Wait");
            try {
            Thread.sleep(10000);
            yt.count=0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }

        if(yt.loggedIn){
            yt.play();
        }else{
            System.out.println("Please Login First");
        } 
    } 

}
