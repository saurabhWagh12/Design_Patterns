public class ram8GB implements RAM{
    private ram8GB(){
        System.out.println("RAM-8-GB");
    }
    public static RAM getRam(){
        return new ram8GB();
    }
}
