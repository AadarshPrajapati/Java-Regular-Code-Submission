package complexnumber;
import java.util.Random;
import java.util.*;

import java.sql.SQLException;

public class studentjdbctest {
	
	private static final String SQL_DROP1 = "DROP TABLE IF EXISTS student";
	private static final String SQL_DROP2 = "DROP TABLE IF EXISTS result";
	private static final String SQL_CREATE_STUDENT = "CREATE TABLE student("
			+ " id int(3) primary key,"
			+ " name varchar(100) NOT NULL,"
			+ " FOREIGN KEY(id) REFERENCES result(id) "
			+")";
	
	private static final String SQL_CREATE_RESULT = "CREATE TABLE result("
			+ " id int(3) primary key,"
			+ " physics int(3) NOT NULL,"
			+ " chemistry int(3) NOT NULL,"
			+ " maths int(3) NOT NULL,"
			+ " sum int(3)"
			+")";
	private static final String SQL_UPDATE_SUM="UPDATE result SET sum=physics+chemistry+maths";

public static void main(String[] args) throws SQLException {
		char ch;
		studentjdbc database = new studentjdbc();
//		database.createTable(SQL_CREATE_RESULT,SQL_DROP2);
//		database.createTable(SQL_CREATE_STUDENT,SQL_DROP1);
//		Random rand = new Random(); 
//		String names[]={"harry","insane","jhon wick","black hat","elEleven","dev","raj","jhonny","Nineteen","emma"};
//		for(int i=1;i<11;i++) {
//			database.insertIntoResult(i,rand.nextInt(100-40) + 40,rand.nextInt(100-40) + 40,rand.nextInt(100-40) + 40);
//			database.insertIntoStudentUsingPreparedStatement(i,names[i-1]);
//		}
		database.updatesum(SQL_UPDATE_SUM);
		do {
			System.out.println("1.Find Total Student\n2.Averge marks subjectwise\n3.Highest Marks\n4.Subjectwise topper\n5.Average marks of all student"
					+ "\n6.Second highest mark\n7.Tally devision\nEnter your choice");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			case 1:database.totalStudent();
				break;
			case 2:System.out.println("1.Phyics\n2.Chemistry\n3.Maths\nEnter your choice");
				choice=sc.nextInt();
				if(choice==1) {
					database.averageMarksSubWise(1);
				}
				else if(choice==2) {
					database.averageMarksSubWise(2);
				}
				else if(choice==3) {
					database.averageMarksSubWise(3);
				}
				else {
					System.out.print("Wrong code entered");
				}
				break;
			case 3:database.highestMarks();
				break;
			case 4:database.subjectWiseToppers();
				break;
			case 5:database.avergeMarks();
				break;
			case 6:database.secondHighestMarks();
				break;
			case 7:database.countDevision();
				break;
			default:System.out.println("Wrong Choice");			
			
		}
		
		System.out.println("do you want to continue");
		ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}
