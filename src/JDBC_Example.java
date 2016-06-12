import java.sql.*;

public class JDBC_Example {
	public static void main(String[] args) 
		   {
		    String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		    String DB_URL = "jdbc:mysql://localhost/EMPLOYEE";
		    String USER = "root";
		    String PASS = "admin1";
		   try{
			   String name="'Ajay'";
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Connecting to database...");
		      
		      Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      System.out.println("Creating statement...");
		      Statement stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery("SELECT * FROM emp where name ="+name);
		      while(rs.next()){
		    	  System.out.println("ID : "+rs.getInt("id")+"    Name: "+rs.getString("name") + "	City : "+rs.getString("city"));
		      }
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
	}
}
