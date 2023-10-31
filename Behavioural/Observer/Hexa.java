public class Hexa implements Observer{
    private Decimal num;
    public Hexa(Decimal n){
        num = n;
        num.add(this);
    }
    @Override
    public void display() {
        System.out.println(num.num+" Converted To Hexa Number");
    }
    @Override
    public void update() {
        int decimalNumber = num.num; 

        String hexadecimalString = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal representation: " + hexadecimalString);
    }
}
