package assignment4;

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter the number you want to check ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
