package condb;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
		public static Connection getConnection() {
	        try  {
	        	Class.forName("org.postgresql.Driver");
	        	Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.0.161:5432/npdb", "dsa","password");
	        	//Connection con = DriverManager.getConnection("jdbc:postgresql://192.168.0.195:5432/npdb", "postgres","postgres");
	        	
	        	/*
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection
	                    ("jdbc:mysql://localhost:3306/jtree_category",
	                    "root","yourdbpass");
	                    */
	            return con;
	        }
	        catch(Exception ex) {
	            System.out.println("Database.getConnection() Error -->" + ex.getMessage());
	            return null;
	        }
	    }

	     public static void close(Connection con) {
	        try  {
	            con.close();
	        }
	        catch(Exception ex) {
	        }
	    }
	     
	     
}
