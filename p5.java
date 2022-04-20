package assignment4;

import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {

        int count = 0;
        System.out.println("Enter the number you want to count ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of digits  " + count);
    }
}
