public class Main {
    public static void main(String args[]){
        Employee ceo = new Leaf(101,"Saurabh","CEO");
        Employee salesM = new Composite(201, "Rashmi","Sales-Manager" );
        Employee productionM = new Composite(202, "Kartik","Production-Manager" );

        Employee clerk1 = new Leaf(420, "Shreyansh", "Clerk");
        Employee clerk2 = new Leaf(421, "Utkarsh", "Clerk");
        Employee clerk3 = new Leaf(423, "Shruti", "Clerk");



        Composite ceoTeam = new Composite(0, null, null);
        ceoTeam.addEmployee(ceo);
        ceoTeam.addEmployee(salesM);
        ceoTeam.addEmployee(productionM);
        System.out.println("CEO :"+ceo.hashCode());
        System.out.println("Sales-M: "+salesM.hashCode());
        System.out.println("Production-M: "+productionM.hashCode());


        ceoTeam.showEmployee();
        System.out.println();

        System.out.println("Sales-M: "+salesM.hashCode());
        System.out.println("Clerk-2: "+clerk2.hashCode());
        System.out.println("Clerk-3: "+clerk3.hashCode());


        salesM.addEmployee(salesM);
        salesM.addEmployee(clerk2);
        salesM.addEmployee(clerk3);
        salesM.showEmployee();
        System.out.println();

        System.out.println("Production-M: "+productionM.hashCode());
        System.out.println("Clerk-1: "+clerk1.hashCode());

        productionM.addEmployee(productionM);
        productionM.addEmployee(clerk1);
        productionM.showEmployee();




    }
}
