public class Main{
    public static void main(String[] args) {
        //Idea is to Implement Notify functionality of amazon when out of stock product come's back in stock:
        Phone p = new Phone();
        p.add(new NotifyuserEmail(p));
        p.add(new NotifyuserText(p));
        p.setData(10);
        p.setData(30);

    }
}
