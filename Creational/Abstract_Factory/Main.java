public class Main {
    public static void main(String args[]){
        Object gel = PenFactory.getPen("gel");
        System.out.println(gel.hashCode());
        System.out.println();
        Object sketch = PenFactory.getPen("sketch");
        System.out.println(sketch.hashCode());

    }
}
