package context;
import java.sql.*;

public class DbContext {
    
    private final String serverName = "PC232";
    private final String dbName = "ShopDB";
    private final String portNumber = "1433";  
    private final String userID = "sa";
    private final String password = "sa";
    
    public Connection getConnection()
    {
        Connection conn=null;
        try{ 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //b2. dinh nghia chuoi ket noi URL
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            //b3.Thiet lap ket noi
            conn = DriverManager.getConnection(url,userID,password);       
        }catch(Exception ex){
            System.out.println("Error:" + ex.toString());
        }
        return conn;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Ket Qua ket noi:" + new DbContext().getConnection());
    }
}
