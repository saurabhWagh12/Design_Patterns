import java.util.*;
public class Composite implements Employee{
    String Position,name;
    int id;
    ArrayList<Employee> emps = new ArrayList<>();
    public Composite(int id,String name,String p){
        this.id = id;
        this.name = name;
        this.Position = p;
    }

    public String getName(){
        return this.name;
    }

    public void addEmployee(Employee e){
        this.emps.add(e);
    }
    public void showEmployee(){
        for(int i=0;i<emps.size();i++){
            if(emps.get(i) instanceof Composite){
                System.out.println("Composite: "+emps.get(i).getName());
                emps.get(i).showEmployee();
            }
            if (emps.get(i) instanceof Leaf){
                System.out.println("Leaf: "+emps.get(i).getName());
            }
        }
        return;
    }
}
