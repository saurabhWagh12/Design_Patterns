public class Main {
    public static void main(String args[]){
        //Subject:
        Decimal d = new Decimal();

        //Observers:
        Binary b = new Binary(d);
        Octal o = new Octal(d);
        Hexa h = new Hexa(d);
        d.setNum(7);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        d.setNum(10);
    }
}
