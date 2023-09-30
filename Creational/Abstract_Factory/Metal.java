public class Metal implements Body{
    public Body getBody(){
        System.out.println("Metal body created");
        return new Metal();
    }
}