package complexnumber;

import java.sql.*;


public class jdbcexample {

	public static final String DB_URL = "jdbc:mysql://localhost:3306/facebook";
	public static final String DB_USERNAME = "root";
	public static final String DB_PASSWORD = "nokia@1234";

	private static final String SQL_CREATE_EMPLOYEE = "CREATE TABLE employees("
			+ " id int(3) primary key,"
			+ " name varchar(100) NOT NULL,"
			+ " address varchar(145) NOT NULL,"
			+ " email varchar(100) NOT NULL"
			+ ")";

	private static final String INSERT_SQL="INSERT INTO employees "
		      + "(id, name, address, email) VALUES (?,?,?,?)";
	private static final String SQL_DROP = "DROP TABLE IF EXISTS employees";
	
	private Connection connection;
	private Statement statement ;
	private PreparedStatement preStat;
	
	public jdbcexample() throws SQLException {
		connection = getConnection();
		statement = connection.createStatement();
	}

	public static void checkConnection() {

		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager
					.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			
			System.out.println("SQL Connection to database established!");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			return;
		} finally {
			try
			{
				if(connection != null)
					connection.close();
				System.out.println("Connection closed !!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
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
		connection = DriverManager
				.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
//		System.out.println("SQL Connection to database established!");

		return connection;

	}
	
	public boolean createTable(String query) throws SQLException {
		statement.executeUpdate(SQL_DROP);
		int result = statement.executeUpdate(query);
		if(result > 0) {
			System.out.println("Table Created");
			return true;
		}
		return false;
	}
	public void insertIntoEmployee(int id ,String name, String address, String email) throws SQLException {
		
		 String insert = "INSERT INTO employees(id, name, address, email) " +
	                "VALUES (" + id +",'" + name + "','" + address+ "','" + email + "')";
		 System.out.println(insert);
		 int rowsInserted = statement.executeUpdate(insert);
			if (rowsInserted > 0) {
				System.out.println("Row Inserted");
			}

	}
	
	public void insertIntoEmployeeUsingPreparedStatement(int id ,String name, String address, String email) throws SQLException {
		PreparedStatement stmt = null;
		stmt = connection.prepareStatement(INSERT_SQL);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setString(3, address);
		stmt.setString(4, email);
		
		int rowsInserted = stmt.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("Row Inserted");
		}
//		stmt.setDate(3, new Date(dateFormat.parse("1995-07-01").getTime()));

	}
	public void selectAllFromEmp() throws SQLException {
		String sql = "SELECT * FROM employees";
		 
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		 
		int count = 0;
		 
		while (result.next()){
			int id =  result.getInt(1);
		    String name = result.getString(2);
		    String address = result.getString(3);
		    String email = result.getString("email");
		 
		    String output = "Employees #%d: %s - %s - %s - %s";
		    System.out.println(String.format(output, ++count, id, name, address, email));
		}
	}

	public void updateEmployee() throws SQLException {
		String sql = "UPDATE employees SET address=? WHERE name=?";
		 
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "C-782, Shivaji Park, Delhi ");
		statement.setString(2, "Ajit");
		 
		int rowsUpdated = statement.executeUpdate();
		if (rowsUpdated > 0) {
		    System.out.println("An existing user was updated successfully!");
		}
	}
	public void delete() throws SQLException {
		String sql = "DELETE FROM employees WHERE name=?";

		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Ajit");

		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("A user was deleted successfully!");
		}
	}
	public static void main(String[] args) throws SQLException {
		
		
		jdbcexample database = new jdbcexample();
		database.createTable(SQL_CREATE_EMPLOYEE);
		database.insertIntoEmployee(256,"Ajay", "A-22, Raman Park, Delhi", "rahul@gmail.com");
		database.insertIntoEmployeeUsingPreparedStatement(768, "Ajit", "b-23,Raj Nagar, Delhi", "ajit@gmail.com");
//		database.selectAllFromEmp();
//		database.updateEmployee();
//		database.delete();
		database.selectAllFromEmp();
		
		
		
		//		Database.checkConnection();
//		Connection connection = null;
//		try {
//			connection = Database.getConnection();
//			if(connection != null) {
//				System.out.println("Connection successfully created");
//				
//				
//				// CRUD
//				
//
//			}
//		}catch (SQLException e) {
//			System.out.println("Connection Failed! Check output console");
//		} finally {
//			try
//			{
//				if(connection != null)
//					connection.close();
//				System.out.println("Connection closed !!");
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}

	}

}