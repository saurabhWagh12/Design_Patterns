public class Main{
    public static void main(String args[]){
        User u = new LoginDecorator(new Decorator("Saurabh",true));
        u.Show();

        User y = new LoginDecorator(new Decorator("Wagh",false));
        y.Show();

    }
}