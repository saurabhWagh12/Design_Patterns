import java.util.*;
public class Decimal {
    private ArrayList<Observer> observers = new ArrayList<>();
    public int num;

    public void setNum(int n){
        this.num = n;
        this.notifyall();
    }
    public void add(Observer ob){
        this.observers.add(ob);
    }
    private void notifyall(){
        for(Observer ob:this.observers){
            ob.display();
            ob.update();
            System.out.println();
        }
    }
}
