
public class DBConnection{
    private boolean connected = false;
    private static DBConnection DB = new DBConnection(true);
    private DBConnection(){}
    private DBConnection(boolean t){
        connected = t;
    }

    public static DBConnection getConnection(){
        return DB;
    }
}