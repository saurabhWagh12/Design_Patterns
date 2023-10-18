public class Main {
    public static void main(String args[]){
        Beverage b = new Tea();
        System.out.println(new Sugar(new Milk(b)).cost());
    }
}
