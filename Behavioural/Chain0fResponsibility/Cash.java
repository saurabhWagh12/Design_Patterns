public class Cash implements Handler{
    Payment p;
    Handler next;
    public Cash(Payment p){
        this.p = p;
        next = new UPI(p);
    }

    public void handlePayment(){
        if(p.amount<1000){
            System.out.println("Handled by Cash: ");
            p.showAmount();
        }else{
            next.handlePayment();
        }
        
    }
    
}
