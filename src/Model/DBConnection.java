package Model;
import java.sql.*;

public class DBConnection {
   private static Connection con;
   public static Connection createDBConnection()
   {   
       try{
            String url = "jdbc:mysql://localhost/hotel_system";
            con = DriverManager.getConnection(url,"root","");
       }
       catch(SQLException e)
       {
            System.err.println(e.getMessage());
       }
       return con;  
   }

}
