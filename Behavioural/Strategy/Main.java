public class Main{
    public static void main(String[] args) {
        Vehicle sport = new Sports("Rear Wheel powered Drive");
        Vehicle commute = new Commute("Normal front wheel drive");
        Vehicle SUV = new SUV("4X4 drive");

        SUV.drive();
        commute.drive();
        sport.drive();
    }
}