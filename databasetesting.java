package complexnumber;

public class databasetesting {

	public static void main(String[] args) {
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("connected");
		} 
		catch (ClassNotFoundException e) {
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		}

	}

}
