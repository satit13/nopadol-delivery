package condb;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mssqldb {
	public static Connection getConnection() {
		String strUrl="jdbc:sqlserver://192.168.0.7; databaseName=npdb";
        try  {
        	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	Connection sqlcon = DriverManager.getConnection(strUrl, "sa", "[ibdkifu");        	
            return sqlcon;
        }
        catch(Exception ex) {
            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
            return null;
        }
    }

     public static void close(Connection sqlcon) {
        try  {
            sqlcon.close();
        }
        catch(Exception ex) {
        }
    }
}
