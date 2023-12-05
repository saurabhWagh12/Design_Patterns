public class BrownSugar extends Decorator{
    public BrownSugar(Beverage b){
        this.beverage = b;
        this.cost = 20.00;
    }
    @Override
    public double cost() {
        return this.beverage.cost() + this.cost;
    }

}
