public class PenFactory {
    public static Object getPen(String s){
        if(s.equals("gel")){
            GelPen g = new GelPen();
            System.out.println(g.hashCode());
            return g;
        }else if(s.equals("sketch")){
            SketchPen sp = new SketchPen();
            System.out.println(sp.hashCode());
            return sp;
        }
        return null;
    }
}
