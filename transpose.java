package assignment4;

import java.util.Scanner;

public class transpose {
    public static void transposeMatrix(int[][] arr) {
        int[][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     int [][] arr=new int[10][10];
     System.out.println("enter the array having size 3*3 ");
     for (int i=0;i<3;i++){
         for(int j=0;j<3;j++){
             arr[i][j]=sc.nextInt();
         }
     }
     transposeMatrix(arr);
    }
}
