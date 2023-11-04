public class Main {
    public static void main(String[] args) {
        Mediator m = new Mediator();
        Member1 m1 = new Member1(m);
        Member2 m2 = new Member2(m);
        Member3 m3 = new Member3(m);

        m1.setMessage("Message by Member 1");
        m1.send();
        System.out.println();
        m2.setMessage("Message by Member 2");
        m2.send();
        System.out.println();
        m3.setMessage("Message by Member 3");
        m3.send();

    }    
}
