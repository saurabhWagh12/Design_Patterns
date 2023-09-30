public class IOS implements OS{
    private IOS(){
        System.out.println("IOS");
    }
    public static OS getOS(){
        return new IOS();
    }
}
