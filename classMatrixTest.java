package complexnumber;
import java.util.*;

public class classMatrixTest {


	public static void main(String[] args) {
		char ch;
		int[][] first=new int[10][20];
		int [][] second=new int[10][20];
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("***************************************************");
			System.out.println("Welcome to matrix code");
			System.out.println("1.Addition\n2.Subtraction\n3.Transpose\n\nEnter your choice :\n");
			int choice=sc.nextInt();
			if (choice==1||choice==2) {
			
		
				System.out.println("Enter the rows and column of the first matrix :");
				int row1=sc.nextInt();
				int column1=sc.nextInt();
				System.out.println("Enter the first matrix :");
				for(int i=0;i<row1;i++) {
					for(int j=0;j<column1;j++) {
						first[i][j]=sc.nextInt();
					}
				}
				
				classMatrix A=new classMatrix(first,row1,column1);
				
				System.out.println("Enter the rows and column of the second matrix :");
				int row2=sc.nextInt();
				int column2=sc.nextInt();
				System.out.println("Enter the second matrix :");
				for(int i=0;i<row2;i++) {
					for(int j=0;j<column2;j++) {
						second[i][j]=sc.nextInt();
					}
				}
				
				classMatrix B=new classMatrix(second,row2,column2);
				
				if(choice==1) {
					A.addition(B);
				}
				
				else {
					A.subraction(B);
				}
			}
			
			if(choice==3) {
				System.out.println("Enter the rows and column of the matrix :");
				int row1=sc.nextInt();
				int column1=sc.nextInt();
				System.out.println("Enter the matrix :");
				for(int i=0;i<row1;i++) {
					for(int j=0;j<column1;j++) {
						first[i][j]=sc.nextInt();
					}
				}
				
				classMatrix A=new classMatrix(first,row1,column1);
				A.transpose();
			}
			
			
		System.out.println();
		System.out.println("Do you want to continue type y/n: ");
		ch = sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		System.out.println("END OF CODE");
		System.out.println("****************************************************");
	}
}
