package complexnumber;
import java.util.*;
import java.util.Objects;

public class classComplexTest {
	
	public static void main(String[] args) {
		
		char ch;
		Scanner sc=new Scanner(System.in);
	
		do {
			System.out.println("Enter the real part of first number: ");
			double re1 = sc.nextInt();
			System.out.println("Enter the imaginary part of first number: ");
			double im1 = sc.nextInt();
			System.out.println("Enter the real part of second number: ");
			double re2 = sc.nextInt();
			System.out.println("Enter the imaginary part of second number: ");
			double im2 = sc.nextInt();
			
			classComplex a=new classComplex(re1,im1);
			classComplex b=new classComplex(re2,im2);
			
			System.out.println("****************************************************");
			System.out.println("1.Additon\n2.Subtraction\n3.Multiplication\n4.Division");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("a + b        = " + a.plus(b));
				break;
			case 2:System.out.println("a - b        = " + a.minus(b));
				break;
			case 3:System.out.println("a * b        = " + a.times(b));
				break;
			case 4:System.out.println("a / b        = " + a.divides(b));
				break;
			} 
			System.out.println("Do you want to continue type y/n: ");
			ch = sc.next().charAt(0);
			}while(ch=='Y'||ch=='y');
		System.out.println("END OF CODE");
		System.out.println("****************************************************");
	}

}
