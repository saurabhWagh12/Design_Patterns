public class NotifyuserEmail implements Observer{
    Observable obj;
    public NotifyuserEmail(Observable o){
        this.obj = o;
    }
    @Override
    public void update() {
        int c = obj.getData();
        System.out.println("Email: {Current Count of Object is: "+c+"}");
    }
}
