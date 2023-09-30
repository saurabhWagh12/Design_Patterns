public class ram6GB implements RAM{
    private ram6GB(){
        System.out.println("RAM-6-GB");
    }
    public static RAM getRam(){
        return new ram6GB();
    }
}
