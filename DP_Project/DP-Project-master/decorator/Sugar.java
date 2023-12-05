public class Sugar extends Decorator{
    public Sugar(Beverage b){
        this.beverage = b;
        this.cost = 10.00;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + this.cost;
    }

}
