public class Payments {
    double amount;
    Beverage item;
    Chef observer = new Chef(this);

    public Payments(double amount, Beverage item) {
        this.amount = amount;
        this.item = item;
    }

    void makepayment() {
        System.out.println("\n\nInitialising Payment.....");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n\nProcessing Payment for " + item.cost() + ".....");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n\nPayment Successful 🏆");
        System.out.println("Thank You 🙏");
        // Notify:
        observer.Cook(item);

    }
}
