package assignment4;

import java.util.Scanner;

class p2 {
    public static void main(String[] args) {

        int i=1,a = 0, b = 1,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want series ");
        num=sc.nextInt();
        System.out.println("Fibonacci Series till " + num + " terms:");

        while (i <= num) {
            System.out.print(a + ", ");

            int nextTerm = a + b;
            a = b;
            b = nextTerm;

            i++;
        }
    }
}


