package assignment4;

import java.util.Scanner;

class integerPelindrome{
    public static void main(String args[]){
        int rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        temp=num;
        while(num>0){
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum)
            System.out.println(" number "+sum+" is pelindrome");
        else
            System.out.println("number "+temp+" is not pelindrome");
    }
}
