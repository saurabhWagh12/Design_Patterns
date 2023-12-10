// Every child class of Vehicle which is created will define its own Strategy to drive:
class Commute extends Vehicle{
    public Commute(String s){
        super(s);
    }
    @Override
    void drive() {
        System.out.println("Driving Capabilities : "+this.capabilities);
    }
}
