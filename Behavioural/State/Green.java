public class Green implements Light{
    private static Light light = new Green();
    private Green(){

    }
    public static Light getLight() {
        synchronized (Yellow.class) {
            if (light == null) {
                light = new Green();
            }
            return light;
        }
    }
    @Override
    public void work() {
        System.out.println("Green Light (Go)");
    }
}
