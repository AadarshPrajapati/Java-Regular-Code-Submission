package complexnumber;

import java.util.Scanner;

public class matrix {
	
	 void calc(int row,int col,int choice) {
		int[][] A = new int[10][20];
		int[][] B = new int[10][20];
		int [][] C=new int[10][20];
		System.out.println("Enter 1st matrix");
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2st matrix");
//		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				 B[i][j]=sc.nextInt();
			}
		}
		
		if (choice==1) {
//			int [][] C=new int[10][20];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					C[i][j]=A[i][j]+B[i][j];
				}
			}
			
		}
		
		else if (choice==2) {
//			int [][] C=new int[10][20];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					C[i][j]=A[i][j]-B[i][j];
				}
			}
			
		}
		
		else {
//			int [][] C=new int[10][20];2
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					for(int k=0;k<col;k++) {
						C[i][j]+=A[i][k]*B[k][j];
					}
				}
		}
	}
		
		
		for(int i=0;i<row;i++) {System.out.println("\n");
			for(int j=0;j<col;j++) {
				System.out.print(" "+C[i][j]+" ");
			}

	}

	}
	public static void main(String[] args) {
		matrix m=new matrix();
		System.out.println("Enter size of matrix row and column");
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		int row= sc.nextInt();
		int col=sc.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\nEnter Your Choice");
		int choice=sc.nextInt();
		if (choice>=1 && choice<=3) {
			m.calc(row,col,choice);
		}
		else{System.out.print("Wrong Choice");
		}
				}
		
	}


