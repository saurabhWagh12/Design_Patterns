class SketchPen{
    Refill r;
    Body b;
    public SketchPen(){
        Fiber m = new Fiber();
        this.b = m.getBody();
        Sponge p = new Sponge();
        this.r = p.getRefill();
        System.out.println("Sketchpen Created");
    }
    public void write(){
        System.out.println("Written by Sketch pen");
    }
}