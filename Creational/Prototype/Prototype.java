public class Prototype implements Cloneable{
    String name;
    public Prototype(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException{
        Prototype p = (Prototype)super.clone();
        return p;
    }

    public void getDetails(){
        System.out.println("Details:");
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.hashCode()+"\n");
    }
}