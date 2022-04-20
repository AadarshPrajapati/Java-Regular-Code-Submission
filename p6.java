package assignment4;

import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {

        System.out.println("Enter the number you want to check ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();


        System.out.print("Factors of " + number + " are ");


        for (int i = 1; i <= number; ++i) {


            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}