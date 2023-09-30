class GelPen{
    Refill r;
    Body b;
    public GelPen(){
        // Metal m = new Metal();
        this.b = new Metal();
        Plastic p = new Plastic();
        this.r = p.getRefill();
        System.out.println("Gelpen Created");
    }
    public void write(){
    System.out.println("Written by Gel pen");
    }
}