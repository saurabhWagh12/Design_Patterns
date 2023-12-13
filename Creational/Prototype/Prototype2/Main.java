public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot("Robot_1", "Fighter");
        Robot r2 = (Robot)r1.clone();

        r1.getDetails();
        r2.name = "Robot_2";
        r2.getDetails();

    }
}
