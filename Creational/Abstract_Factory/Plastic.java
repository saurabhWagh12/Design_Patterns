public class Plastic implements Refill{
    public Refill getRefill(){
        System.out.println("Plastic refill created");
        return new Plastic();
    }
}