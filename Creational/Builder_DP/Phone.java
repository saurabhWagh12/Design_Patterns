public class Phone{
    private OS os;
    private RAM ram;
    private ScreenSize size;

    private Phone(PhoneBuilder pb){
        this.os = pb.os;
        this.ram = pb.ram;
        this.size = pb.size;
    }
    public void getPhone(){
        System.out.println("Phone details:");
        System.out.println("OS: "+this.os.get());
        System.out.println("RAM: "+this.ram.get());
        System.out.println("Size: "+this.size.get()); 
    }

    static class PhoneBuilder{
        private OS os;
        private RAM ram;
        private ScreenSize size;

        public PhoneBuilder setOs(OS os) {
            this.os = os;
            return this;
        }
        public PhoneBuilder setRam(RAM ram) {
            this.ram = ram;
            return this;
        }
        public PhoneBuilder setSize(ScreenSize size) {
            this.size = size;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }

    }
}