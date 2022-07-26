package complexnumber;

public class classMatrix {
	
	private int[][] matrix = new int[10][20]; // matrix variable to store matrix
	private int[][] finalmatrix = new int[10][20]; // final matrix where result will be stored
	private int row,column;

	// create a new object with the matrix initialization 
	public classMatrix(int[][] A,int roww,int col) {
		matrix=A;
		row=roww;
		column=col;
	}
	// addition of matrices
	public classMatrix addition(classMatrix b) {
		classMatrix a=this;
		if(a.row==b.row && a.column==b.column) {
			for(int i=0;i<a.row;i++) {
				for(int j=0;j<a.column;j++) {
					finalmatrix[i][j]=a.matrix[i][j]+b.matrix[i][j];
				}
			}
			
			for(int i=0;i<a.row;i++) {
				System.out.println();
				for(int j=0;j<a.column;j++) {
					System.out.print(" "+finalmatrix[i][j]+" ");
				}
		}
	}
		
		else {
			System.out.println("Both matrices must have same no of rows and column");
		}
		
		return a;
		

	}
	
	// subraction of matrices
	public classMatrix subraction(classMatrix b) {
		classMatrix a=this;
		if(a.row==b.row && a.column==b.column) {
			for(int i=0;i<a.row;i++) {
				for(int j=0;j<a.column;j++) {
					finalmatrix[i][j]=a.matrix[i][j]-b.matrix[i][j];
				}
			}
			for(int i=0;i<a.row;i++) {
				System.out.println();
				for(int j=0;j<a.column;j++) {
					System.out.print(" "+finalmatrix[i][j]+" ");
				}
		}
	}
		
		else {
			System.out.println("Both matrices must have same no of rows and column");
		}
		
		return a;
	}
	
	// multiplication of matrices
	public void multiplication(classMatrix b) {
		classMatrix a=this;
		if(a.column==b.row) {
			for(int i=0;i<a.row;i++) {
				for(int j=0;j<a.column;j++) {
					finalmatrix[i][j]=a.matrix[i][j]*b.matrix[i][j];
				}
			}
		}
		
		else {
			System.out.println("The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
		}
		
	}
	
	// transpose of matrices
	public void transpose() {
		classMatrix a=this;
		for(int i=0;i<a.row;i++) {
			for(int j=0;j<a.column;j++) {
				finalmatrix[i][j]=a.matrix[j][i];
			}
		}
	
		for(int i=0;i<a.row;i++) {
			System.out.println();
			for(int j=0;j<a.column;j++) {
				System.out.print(" "+finalmatrix[i][j]+" ");
			}
		}
	
	}
}