public class Main{
    public static void main(String args[]){
        DBConnection con1,con2;
        con1 = DBConnection.getConnection();
        con2 = DBConnection.getConnection();

        System.out.println("Connection 1 id: "+con1.hashCode());
        System.out.println("Connection 2 id: "+con1.hashCode());
    }
}