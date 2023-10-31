public class NotifyuserText implements Observer{
    Observable obj;
    public NotifyuserText(Observable o){
        this.obj = o;
    }
    @Override
    public void update() {
        int c = obj.getData();
        System.out.println("Text: {Current Count of Object is: "+c+"}");
    }
}
