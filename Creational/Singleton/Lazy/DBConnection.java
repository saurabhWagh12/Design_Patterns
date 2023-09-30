public class DBConnection{
    private boolean connected = false;
    private static DBConnection DB;

    private DBConnection(){}
    private DBConnection(boolean t){
        this.connected = t;
    }

    public static DBConnection getConnection(){
        if(DB==null){
            synchronized(DBConnection.class){ 
                if(DB == null)
                    DB = new DBConnection(true);
            }
        }else{
            return DB;
        }
        return DB;
    }
}