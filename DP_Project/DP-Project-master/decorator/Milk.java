public class Milk extends Decorator {
    public Milk(Beverage b) {
        this.beverage = b;
        this.cost = 20.00;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + this.cost;
    }

}
