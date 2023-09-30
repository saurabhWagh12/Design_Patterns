public class Sponge implements Refill{
    public Refill getRefill(){
        System.out.println("Sponge refill created");
        return new Sponge();
    }
}