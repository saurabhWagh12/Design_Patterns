public class Leaf implements Employee{
    private String Position,name;
    private int id;

    public Leaf(int id,String name,String p){
        this.id = id;
        this.name = name;
        this.Position = p;
    }
    public String getName(){
        return this.name;
    }
    public void addEmployee(Employee e){}
    public void showEmployee(){}

}
