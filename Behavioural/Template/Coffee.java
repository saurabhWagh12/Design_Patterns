public class Coffee extends Recipe{


    //Primitives:
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void serve() {
        System.out.println("Serving Coffee ☕️");
    }

    //Hooks
    @Override
    public void boilWater() {
        super.boilWater();
    }
}
