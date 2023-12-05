public class SignalContext {
    Light light;
    public SignalContext(){
        light = Red.getLight();
    }   
    public void setContext(Light l){
        light = l;
    }

    public void useContext(){
        light.work();
    }
}
