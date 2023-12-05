public class AlmondMilk extends Decorator{
    public AlmondMilk(Beverage b){
        this.beverage = b;
        this.cost = 30.00;
    }
    @Override
    public double cost() {
        return this.beverage.cost() +this.cost;
    }

}