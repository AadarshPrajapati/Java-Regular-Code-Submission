package assignment4;

public class lowertraingle
{
    public static void main(String[] args) {
        int rows, cols;

        int arr[][] = {
                {1, 2, 3},
                {7, 0, -1},
                {7, 3, 2}
        };


        rows = arr.length;
        cols = arr[0].length;

        if(rows != cols){
            System.out.println("Matrix should be a square matrix");
        }
        else {

            System.out.println("Lower triangular matrix: ");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){
                    if(j > i)
                        System.out.print("0"+" ");
                    else
                        System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
