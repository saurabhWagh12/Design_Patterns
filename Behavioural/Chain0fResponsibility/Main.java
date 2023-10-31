public class Main {
    public static void main(String args[]){
        Banking b = new Banking(new Payment(50000));
        b.handlePayment();
    }
}
