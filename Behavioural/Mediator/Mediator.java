import java.util.ArrayList;

public class Mediator{
    ArrayList<Member> list = new ArrayList<>();
    public void add(Member m){
        list.add(m);
    }
    public void send(Member m){
        // m.sendMessage();
        notifyAllMembers(m);
    }
    private void notifyAllMembers(Member me){
        for(Member m:list){
            if(m.hashCode()!=me.hashCode()){
                m.received(me.getMessage());
            }   
        }
    }
}