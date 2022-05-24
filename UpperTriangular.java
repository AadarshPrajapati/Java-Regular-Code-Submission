package assignment4;

public class UpperTriangular
{
    public static void main(String[] args) {
        int rows, cols;

        int ar[][] = {
                {1, 3, 3},
                {8, 6, 4},
                {4, 1, 6}
        };

        rows = ar.length;
        cols = ar[0].length;

        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else {

            System.out.println("Upper triangular matrix: ");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(i > j)
                        System.out.print("0 ");
                    else
                        System.out.print(ar[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
