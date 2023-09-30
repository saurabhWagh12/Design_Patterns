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

    public void addEmployee(Employee e){
        this.emps.add(e);
    }
    public void showEmployee(){
        for(int i=0;i<emps.size();i++){
            System.out.println(emps.get(i).hashCode());
        }
    }
}
