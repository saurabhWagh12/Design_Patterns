import java.util.ArrayList;

public class Phone implements Observable{
    ArrayList<Observer> list = new ArrayList<>();
    private int count;

    @Override
    public void setData(int count) {
        this.count = count;   
        this.Notify();
    }
    @Override
    public int getData() {
        return this.count;
    }
    @Override
    public void add(Observer ob) {
        list.add(ob);
    }
    @Override
    public void remove(Observer ob) {
        list.remove(ob);
    }
    @Override
    public void Notify(){
        //Notify all observer's
        for(Observer ob:list){
            ob.update();
        }
    }
}
