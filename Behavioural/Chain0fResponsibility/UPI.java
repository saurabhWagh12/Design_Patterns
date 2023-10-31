public class UPI implements Handler{
    Payment p;
    Handler next;
    public UPI(Payment p){
        this.p = p;
        next = new Card(p);
    }

    public void handlePayment(){
        if(p.amount<10000){
            System.out.println("Handled by UPI: ");
            p.showAmount();
        }else{
            next.handlePayment();
        }
        
    }
}
