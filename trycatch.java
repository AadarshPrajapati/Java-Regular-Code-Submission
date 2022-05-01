package assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch{
    public static void main(String[] args){
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a number ");
            a = sc.nextInt();
            System.out.println("Enter second number ");
            b = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e);
        }

        try{
            int c=a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        sc.close();
        try{
        int d=sc.nextInt();
        }catch (IllegalStateException e){
            System.out.println(e);
        }
    }
}
