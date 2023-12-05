import java.util.Scanner;

class Factory {
    static Beverage base;
    static Beverage item;

    private static void menuBase() {
        System.out.println("************ Menu Card ************");
        System.out.println("Enter 1 for Tea");
        System.out.println("Enter 2 for Coffee\n\n");

    }

    private static void menuExtra() {
        System.out.println("*********** Decorate **********");
        System.out.println("Enter 1 for Sugar");
        System.out.println("Enter 2 for Brown Sugar");
        System.out.println("Enter 3 for Milk");
        System.out.println("Enter 4 for Almond milk\n\n");
    }

    public void makeOrder(){
        int s;
        Scanner sc = new Scanner(System.in);
        Beverage base = null;

        while (true) {
            if (base == null) {
                menuBase();
                System.out.print("Enter Your Choice or (0) to Exit or (10) to make payment: ");
                s = sc.nextInt();
                if (s == 10) {
                    this.Order("Pay");
                    this.item=null;
                    this.base=null;
                    base=null;
                }
                if(s==0){
                    break;
                }

                if (s == 1) {
                    base = this.Order("tea");
                } else if (s == 2) {
                    base = this.Order("coffee");
                } else {
                    System.out.println("Make a Valid Choice!!!");
                }
 
            } else {
                menuExtra();
                System.out.print("Enter Your Choice or (0) to Exit or (10) to make payment: ");
                s = sc.nextInt();
                if (s == 10) {
                    this.Order("Pay");
                    this.item=null;
                    this.base=null;
                    base=null;
                }
                if(s==0){
                    break;
                }
                switch (s) {
                    case 1:
                        this.Order("sugar");
                        break;
                    case 2:
                        this.Order("brown sugar");
                        break;
                    case 3:
                        this.Order("milk");
                        break;
                    case 4:
                        this.Order("almond milk");
                        break;
                }
            }
        }

    }

    private Beverage Order(String b) {

        if (b == null)
            return null;
        if (b.equalsIgnoreCase("Tea") == true) {
            base = new Tea();
            item = base;
            return base;
        }
        if (b.equalsIgnoreCase("Coffee") == true) {
            base = new Coffee();
            item = base;
            return base;
        }
        if (b.equalsIgnoreCase("Almond Milk")) {
            Beverage addition = new AlmondMilk(item);
            item = addition;
            return item;
        }
        if (b.equalsIgnoreCase("Milk")) {
            Beverage addition = new Milk(item);
            item = addition;
            return item;
        }
        if (b.equalsIgnoreCase("Brown Sugar")) {
            Beverage addition = new BrownSugar(item);
            item = addition;
            return item;
        }
        if (b.equalsIgnoreCase("Sugar")) {
            Beverage addition = new Sugar(item);
            item = addition;
            return item;
        }

        if (b.equalsIgnoreCase("pay")) {
            if (base == null) {
                System.out.println("\n\nCannot Make Payment First select some Item\n\n"
                );
                return null;
            }
            Payments p = new Payments(item.cost(), item);
            p.makepayment();
        }

        return null;
    }
}
