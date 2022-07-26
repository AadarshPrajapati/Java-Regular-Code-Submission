package complexnumber;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;


public class studentjdbc {
	
	public static final String DB_URL = "jdbc:mysql://localhost:3306/school";
	public static final String DB_USERNAME = "root";
	public static final String DB_PASSWORD = "nokia@1234";
	
	
	
	private static final String SQL_TOTAL_STUDENT="SELECT COUNT(*) FROM student";
	private static final String SQL_HIGHEST_MARKS="SELECT s.name FROM student s,result r WHERE r.id=s.id AND r.sum=(SELECT MAX(sum) FROM result)";
	
	private static final String INSERT_STUDENT="INSERT INTO student "
		      + "(id, name) VALUES (?,?)";
	private static final String INSERT_RESULT="INSERT INTO result "
		      + "(id,physics,chemistry,maths) VALUES (?,?,?)";
	
	public void insertIntoStudentUsingPreparedStatement(int id ,String name) throws SQLException {
		PreparedStatement stmt = null;
		stmt = connection.prepareStatement(INSERT_STUDENT);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		
		int rowsInserted = stmt.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("Row Inserted");
		}
	}
	
	public void updatesum(String update_sum) throws SQLException{
		int rowUpdated=statement.executeUpdate(update_sum);
		if(rowUpdated>0) {
			 System.out.println("Updated successfully");
		}
	}
	
	public void insertIntoResult(int id ,int physics,int chemistry,int maths) throws SQLException {
		
		 String insert = "INSERT INTO result(id,physics,chemistry,maths)" +
	                "VALUES (" + id +",'" + physics + "','" +chemistry+ "','" + maths + "')";
		 int rowsInserted = statement.executeUpdate(insert);
			if (rowsInserted > 0) {
				System.out.println("Row Inserted");
			}

	}
	
	public void totalStudent() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(SQL_TOTAL_STUDENT);
		while (result.next()){
			int id =  result.getInt(1);
		   System.out.println("Total number of student: "+id);
		}
	}
	
	public void highestMarks() throws SQLException {
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(SQL_HIGHEST_MARKS);
		while (result.next()){
			String name =  result.getString(1);
		   System.out.println("Name of student having highest marks is: "+name);
		}
	}
	
	public void avergeMarks() throws SQLException {
		Statement statement = connection.createStatement();
		String SQL_QRY="SELECT s.name,r.sum/3 FROM student s,result r WHERE s.id=r.id";
		ResultSet result = statement.executeQuery(SQL_QRY);
		while (result.next()){
			String name = result.getString(1);
			float avg=result.getInt(2);
			System.out.println("Averge marks of "+name+" is "+avg);
		}
	}
	
	public void countDevision() throws SQLException {
		Statement statement = connection.createStatement();
		String SQL_QRY1="SELECT COUNT(id)"
				+ "FROM result WHERE sum >=180";
		ResultSet result1 = statement.executeQuery(SQL_QRY1);
		while (result1.next()){
			int count1=result1.getInt(1);
			System.out.println("No of student having first devision is "+count1);
		}
		String SQL_QRY2="SELECT COUNT(id)"
				+ "FROM result WHERE sum >=150 AND sum<179";
		ResultSet result2 = statement.executeQuery(SQL_QRY2);
		while (result2.next()){
			int count2=result2.getInt(1);
			System.out.println("No of student having second devision is "+count2);
		}
		String SQL_QRY3="SELECT COUNT(id)"
				+ "FROM result WHERE sum >=120 AND sum<149";
		ResultSet result3 = statement.executeQuery(SQL_QRY3);
		while (result3.next()){
			int count3=result3.getInt(1);
			System.out.println("No of student having third devision is "+count3);
		}
	
	}
	
	public void secondHighestMarks() throws SQLException {
		Statement statement = connection.createStatement();
		String SQL_QRY="SELECT s.name , max(r.sum) " + 
				" FROM result r,student s" + 
				" where sum<(select max(sum) " + 
				"	from result);";
		ResultSet result = statement.executeQuery(SQL_QRY);
		while (result.next()){
			String name = result.getString(1);
			int marks=result.getInt(2);
			System.out.println("Second highest marks by "+name+" is "+marks);
		}
	}
	
	public void subjectWiseToppers() throws SQLException {
		Statement statement = connection.createStatement();
		//physics
		String SQL_QRY="SELECT s.name FROM student s,result r WHERE r.id=s.id AND r.physics=(SELECT MAX(physics) FROM result r)";
		ResultSet result = statement.executeQuery(SQL_QRY);
		while (result.next()){
			String name =  result.getString(1);
		   System.out.println("Name of student having highest marks in physics: "+name);
		}
		
		//chemistry
		SQL_QRY="SELECT s.name FROM student s,result r WHERE r.id=s.id AND r.chemistry=(SELECT MAX(chemistry) FROM result r)";
		result = statement.executeQuery(SQL_QRY);
		while (result.next()){
			String name =  result.getString(1);
			System.out.println("Name of student having highest marks in chemistry: "+name);
			}
		//maths
		SQL_QRY="SELECT s.name FROM student s,result r WHERE r.id=s.id AND r.maths=(SELECT MAX(maths) FROM result r)";
		result = statement.executeQuery(SQL_QRY);	
		while (result.next()){			
			String name =  result.getString(1);
			System.out.println("Name of student having highest marks in maths: "+name);
		}
				
	}
	
	public void averageMarksSubWise(int choice) throws SQLException {
		Statement statement = connection.createStatement();
		String SQL_QRY="";
		if(choice==1) {
			SQL_QRY="SELECT AVG(physics) FROM result";
		}
		else if(choice==2) {
			SQL_QRY="SELECT AVG(chemistry) FROM result";
		}
		else if(choice==3) {
			SQL_QRY="SELECT AVG(maths) FROM result";
		}
		else {
			System.out.println("Invalid Choice");
		}
		
		if(choice<4) {
		ResultSet result = statement.executeQuery(SQL_QRY);
		while (result.next()){
			float marks =  result.getInt(1);
			String[] subject= {"physics","chemistry","maths"};
			System.out.println("Average Marks of "+subject[choice-1]+" is "+marks);
		}
		}
	}
	
	private Connection connection;
	private Statement statement;
	private PreparedStatement preStat;
	

	public static Connection getConnection() throws SQLException{


		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;
		connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
		System.out.println("SQL Connection to database established!");
		
		return connection;
	}
	
	public boolean createTable(String query,String drops) throws SQLException {
		statement.executeUpdate(drops);
		int result = statement.executeUpdate(query);
		if(result >= 0) {
			System.out.println("Table Created");
			return true;
		}
		return false;
	}
	


	public studentjdbc() throws SQLException {
		connection = getConnection();
		statement = connection.createStatement();
	}
	
}
