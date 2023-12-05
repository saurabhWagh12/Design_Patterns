public class Yellow implements Light {
    private static Light light;
    
    private Yellow() {
    }
    
    public static Light getLight() {
        synchronized (Yellow.class) {
            if (light == null) {
                light = new Yellow();
            }
            return light;
        }
    }
    
    @Override
    public void work() {
        System.out.println("Yellow Light (Wait)");
        // Add your implementation for the work of the yellow light
    }
}
