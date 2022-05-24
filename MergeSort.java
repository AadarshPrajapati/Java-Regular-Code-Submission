package assignment4;

import java.util.Scanner;

public class MergeSort {

    public static void mergeSort(int[] arr){

        if (arr.length<=1)
        {
            return;
        }
        int[] b = new int[arr.length/2];
        int[] c = new int[arr.length-b.length];

        for (int i=0;i<arr.length/2;i++)
        {
            b[i]=arr[i];
        }
        for (int i=arr.length/2;i<arr.length;i++)
        {
            c[i-(arr.length/2)]=arr[i];
        }

        mergeSort(b);
        mergeSort(c);
        merge(b,c,arr);

    }

    public static void merge(int[] b, int[] c, int[] a)
    {
        int i=0,j=0,k=0;
        while (i<b.length && j<c.length)
        {
            if (b[i]<=c[j])
            {
                a[k]=b[i];
                i++;
            }
            else
            {
                a[k]=c[j];
                j++;
            }
            k++;
        }

        while (i<b.length)
        {
            a[k]=b[i];
            i++;
            k++;
        }
        while(j<c.length)
        {
            a[k]=c[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter len of array ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.print("Enter Elements ");
        for(int i=0; i < length; i++)
            arr[i] = sc.nextInt();
        mergeSort(arr);
        System.out.print("Element in Sorted Order ");
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
