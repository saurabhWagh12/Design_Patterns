public class Red implements Light{
    private static Light light;
    private Red(){

    }
    public static Light getLight() {
        synchronized (Yellow.class) {
            if (light == null) {
                light = new Red();
            }
            return light;
        }
    }
    @Override
    public void work() {
        System.out.println("Red Light (Stop)");
    }
}
