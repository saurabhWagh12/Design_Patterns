public class Main {
    public static void main(String[] args) {
        SignalContext context = new SignalContext();
        while(true){
            context.useContext();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            context.setContext(Green.getLight());
            context.useContext();
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            context.setContext(Yellow.getLight());
            context.useContext();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            context.setContext(Red.getLight());
        }
    }
}
