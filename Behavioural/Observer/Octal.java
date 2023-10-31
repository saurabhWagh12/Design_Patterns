public class Octal implements Observer{
    private Decimal num;
    public Octal(Decimal n){
        num = n;
        num.add(this);
    }
    @Override
    public void display() {
        System.out.println(num.num+" Converted To Octal Number");
    }
    @Override
    public void update() {
        int decimalNumber = num.num; // Replace this with your decimal number
        int octalLength = 5;  // Desired length of octal representation
        
        // Using String.format() to convert to octal with padding
        String octalString = String.format("%0" + octalLength + "o", decimalNumber);
        System.out.println("Octal representation: " + octalString);
        
    }
}

