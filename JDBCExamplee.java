package complexnumber;

//STEP 1. Import required packages
import java.sql.*;

public class JDBCExamplee {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://localhost:3306/school";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "nokia@1234";
 
 public static void main(String[] args) {
 Connection conn = null;
 CallableStatement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    String sql = "{call countrows(?, ?)}";
    stmt = conn.prepareCall(sql);
    
    //Bind IN parameter first, then bind OUT parameter
    int id=3;
    stmt.setInt(1,id);
    // Because second parameter is OUT so register it
    stmt.registerOutParameter(2, java.sql.Types.INTEGER);
    
    //Use execute method to run stored procedure.
    System.out.println("Executing stored procedure..." );
    stmt.execute();

    int rows = stmt.getInt(2);
    System.out.println("no of rows in student table "+rows);
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}//end JDBCExample