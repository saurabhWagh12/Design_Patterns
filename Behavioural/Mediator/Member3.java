public class Member3 implements Member{
    String message;
    Mediator m;
    public Member3(Mediator m){
        this.m = m;
        m.add(this);
    }
    public void setMessage(String m){
        this.message = m;
    }
    @Override
    public void sendMessage() {
        System.out.println("Message by Member3");
    }
    @Override
    public void received(String s) {
        System.out.println("Received Message by Member3 :"+s);
    }
    @Override
    public String getMessage() {
        return this.message;
    }
    @Override
    public void send() {
        m.send(this);
    }
}
