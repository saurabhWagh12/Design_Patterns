public class Main{
    public static void main(String args[]){
        
        Shape r = AbstractFactory.getShape("rectangle");
        r.draw();
        Shape s = AbstractFactory.getShape("square");
        s.draw();

    }
}