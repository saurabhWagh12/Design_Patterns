// Every child class of Vehicle which is created will define its own Strategy to drive:
class SUV extends Vehicle{
    public SUV(String s){
        super(s);
    }
    @Override
    void drive() {
        System.out.println("Driving Capabilities : "+this.capabilities);
    }
}
