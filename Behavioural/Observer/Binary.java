public class Binary implements Observer{
    private Decimal num;
    public Binary(Decimal n){
        num = n;
        num.add(this);
    }
    @Override
    public void display() {
        System.out.println(num.num+" Converted To Binary Number");
    }
    @Override
    public void update() {
        int decimalNumber = num.num; // Replace this with your decimal number
        int binaryLength = 8;  // Desired length of binary representation

        String binaryString = String.format("%" + binaryLength + "s", Integer.toBinaryString(decimalNumber)).replace(' ', '0');
        System.out.println("Binary representation: " + binaryString);
    }
}
