public class SonyRemote extends Remote{
    public SonyRemote(Tv tv){
        super(tv);
    }
    public void onTV(){
        super.tv.on();
    }
}
