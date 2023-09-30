public class AbstractFactory {
    
    public static Shape getShape(String s){
        if(s.equals("square") || s.equals("Square"))
            return new Square();
        if(s.equals("rectangle") || s.equals("Rectangle")) 
            return new Rectangle(); 
        return null;
    }
}
