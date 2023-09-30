public class DBConnection{
    private boolean connected = false;
    private static DBConnection DB;

    private DBConnection(){}
    private DBConnection(boolean t){
        this.connected = t;
    }

    synchronized public static DBConnection getConnection(){
        if(DB==null){
            DB = new DBConnection(true);
        }else{
            return DB;
        }
        return DB;
    }
}