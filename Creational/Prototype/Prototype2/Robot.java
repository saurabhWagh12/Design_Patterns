public class Robot implements Prototype{
    String type,name;
    public Robot(String n,String t){
        name = n;
        type = t; 
    }
    public void getDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Type: "+this.type);
    }
    @Override
    public Object clone(){
        return new Robot(name, type);
    }
}
