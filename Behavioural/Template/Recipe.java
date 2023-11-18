abstract class Recipe{
    //Template Method:
    void prepare(){
        boilWater();
        brew();
        pourInCup();
        if(customerAskedCondiments()){
            addCondiments();
        }
        serve();
    }

    //Primitive Methods:
    abstract void brew();
    abstract void addCondiments();
    abstract void serve();

    //Hook Methods:
    boolean customerAskedCondiments(){
        return true;
    }
    void boilWater(){
        System.out.println("Boiling Water...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}