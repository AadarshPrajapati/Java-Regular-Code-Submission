package assignment4;
import java.util.Scanner;
import java.lang.Math;

public class p7 {
    static boolean isArmstrong(int n){
        int temp=n;
        int new_num=0;
        while(n>0){
            int rem=n%10;
            new_num+=Math.pow(rem,3);
            n/=10;
        }
        if(new_num==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
    }

}
