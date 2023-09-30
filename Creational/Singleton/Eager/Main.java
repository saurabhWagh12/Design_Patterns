import javax.naming.ldap.ExtendedResponse;

public class Main{
    public static void main(String args[]){
        //Calling constructor is not allowed as it is Private:
        DBConnection con1 = DBConnection.getConnection();
        DBConnection con2 = DBConnection.getConnection();

        System.out.println("Connection 1 id: "+con1.hashCode());
        System.out.println("Connection 2 id: "+con1.hashCode());

    }
}