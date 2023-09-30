public class Main {
    public static void main(String args[]){
      Prototype original = new Prototype("Original");
      original.getDetails();
      try {
        Prototype clone = original.clone();
        clone.setName("Clone");
        clone.getDetails();
      } catch (Exception e) {
        e.printStackTrace();
      }
        
    }
}
