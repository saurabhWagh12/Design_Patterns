public class LoginDecorator extends Decorator{
    boolean loggedIn; 
    public LoginDecorator(Decorator d){
        super(d.name, d.admin);
        this.loggedIn = true;
    }  
    public void Show(){
        if(u.admin){
        System.out.println("\nUser details:");
        System.out.println("Name: "+u.name);
        
        System.out.println("Admin: "+u.admin);
        System.out.println("Logged-In: "+this.loggedIn);
        System.out.println("\n");
        }
    }  
}
