public class Member2 implements Member{
    String message;
    Mediator m;
    public Member2(Mediator m){
        this.m = m;
        m.add(this);
    }
    public void setMessage(String m){
        this.message = m;
    }
    public void sendMessage() {
        System.out.println("Message by Member2");
    }
    @Override
    public void received(String s) {
        System.out.println("Received Message by Member2 :"+s);
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
