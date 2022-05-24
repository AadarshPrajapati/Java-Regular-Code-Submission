package assignment4;

import java.util.Scanner;

class insertionsort{
    public static void main(String[] args){
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}