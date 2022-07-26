package complexnumber;
import java.util.*;

public class complex {
	String add;
	 @Override
	public String toString() {
		return add;
	}  
	
	void addition(int a,int ia,int b,int ib) {
		int real=a+b;
		int imaginary=ia+ib;
//		System.out.println("addition of two complex number is "+real+"+"+imaginary+"i");
		String add="addition of two complex number is "+real+"+"+imaginary+"i";
		this.add=add;
	}
	
	void subraction(int a,int ia,int b,int ib) {
		int real=a-b;
		int imaginary=ia-ib;
//		System.out.println("subtraction of two complex number is "+real+"+"+imaginary+"i");
		String add="subraction of two complex number is "+real+"+"+imaginary+"i";
		this.add=add;
		
	}
	
	void multiplication(int a,int ia,int b,int ib) {
		int real=a*b-ib*ia;
		int imaginary=a*ib+b*ia;
//		System.out.println("multiplication of two complex number is "+real+"+"+imaginary+"i");
		String add="multiplication of two complex number is "+real+"+"+imaginary+"i";
		this.add=add;
	}
	
	void devision(int a,int ia,int b,int ib) {
		int real=a/b;
		int imaginary=ia/ib;
//		System.out.println("devision of two complex number is "+real+"+"+imaginary+"i");
		String add="devision of two complex number is "+real+"+"+imaginary+"i";
		this.add=add;
	}

	public static void main(String[] args) {
		complex c=new complex();
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter real part of first number");  
		int a= sc.nextInt();  
		System.out.print("Enter imaginary part of first number ");  
		int ia= sc.nextInt();  
		System.out.print("Enter real part of second number");  
		int b= sc.nextInt();  
		System.out.print("Enter imaginary part of second number ");  
		int ib= sc.nextInt();
		System.out.print("1.Addition \n2.Subtraction \n3.Multiplication\n4.Division");
		System.out.print("Enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:c.addition(a,ia,b,ib);
				System.out.println(c.toString());
			break;
		case 2:c.subraction(a,ia,b,ib);
		System.out.println(c.toString());
			break;
		case 3:c.multiplication(a,ia,b,ib);
		System.out.println(c.toString());
			break;
		case 4:c.devision(a,ia,b,ib);
		System.out.println(c.toString());
			break;
		
		}

	}
	
	
}
