public class Card implements Handler{
    Payment p;
    Handler next;
    public Card(Payment p){
        this.p = p;
        next = null;
    }
    public void handlePayment(){
        if(p.amount<100000){
            System.out.println("Handled by Card: ");
            p.showAmount();
        }else{
            System.out.println("Cannot Handle Request");
        }
        
    }
}
