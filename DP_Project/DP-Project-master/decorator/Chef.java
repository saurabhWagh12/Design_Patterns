public class Chef extends Observer {// observer
    // Item getting observed:
    public Chef(Payments p1) {
        super(p1);
    }

    void Cook(Beverage b) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n\nPreparing your Item ☕️...");
    }
}
