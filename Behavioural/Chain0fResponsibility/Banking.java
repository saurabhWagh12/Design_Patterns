public class Banking {
    Payment p;
    
    public Banking(Payment p){
        this.p = p;
    }

    public void handlePayment(){
        Handler h = new Cash(p);
        h.handlePayment();
    }

}