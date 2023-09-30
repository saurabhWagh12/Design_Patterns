public class Decorator extends User{
    User u;
    public Decorator(String name,boolean admin){
        // super(name,admin);
        u = User(name,admin);
    }
}