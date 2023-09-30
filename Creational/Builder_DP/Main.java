
public class Main {
    public static void main(String args[]){
        OS os = new OS("IOS");
        RAM r = new RAM(4);
        ScreenSize ss = new ScreenSize(6.2f);
        
        Phone.PhoneBuilder pb = new Phone.PhoneBuilder();

        Phone phone = pb.setRam(r).setOs(os).setSize(ss).build();
        phone.getPhone();
        System.out.println(phone.hashCode());
        System.out.println();
        
        os = new OS("Android");
        r = new RAM(6);
        ss = new ScreenSize(6.7f);
        phone = new Phone.PhoneBuilder().setOs(os).setRam(r).setSize(ss).build();
        phone.getPhone();
        System.out.println(phone.hashCode());

    }
}
