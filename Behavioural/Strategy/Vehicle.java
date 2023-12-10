// Main Idea:

// Base Class Vehicle will have the data item capabilities of child class:
// Not defining capabilities in base class as in future if new car is launched which wants to have different capabilities then it will justify and set its own capabilities by telling base class capabilities it want. 
abstract class Vehicle{
    String capabilities;
    public Vehicle(String s){
        capabilities = s;
    }
    abstract void drive();
    public void display(){
        System.out.println(capabilities);
    }
}