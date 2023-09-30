public class Fiber implements Body{
    public Body getBody(){
        System.out.println("Fiber body created");
        return new Fiber();
    }
}