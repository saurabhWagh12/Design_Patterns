public class Android implements OS{
    public Android(){
        System.out.println("Android");

    }
    public static OS getOS(){
        return new Android();
    }
}
