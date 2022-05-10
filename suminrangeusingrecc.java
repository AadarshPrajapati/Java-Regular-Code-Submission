package assignment4;

import java.util.Scanner;

public class suminrangeusingrecc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();
        int result = sum(a, b);
        System.out.println("sum in range of "+a+" and "+b+" is "+result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
