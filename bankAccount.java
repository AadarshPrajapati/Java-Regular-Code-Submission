package complexnumber;
import java.util.*;

public class bankAccount {

	protected String accountNumber;
	protected float accountBalance;
	protected String name,password;
	
	public bankAccount(String accountnumber,float accountbalance,String name, String passkey) {
		this.accountNumber=accountnumber;
		this.accountBalance=accountbalance;
		this.name=name;
		this.password=passkey;
		
	}

	public float deposit(float x) {
		this.accountBalance+=x;
		return this.accountBalance;
	}
	
	public int withdraw(float x) {
		int flip=0;
		if(x<=this.accountBalance) {
		this.accountBalance-=x;
		flip=1;
		}
		else {
			System.out.println("Your Account Don't Have Rs."+x);
		}
		
		return flip;
	}
	
	public String getAccount() {
		return this.accountNumber;
	}
	
	public float getBalance() {
		return this.accountBalance;
	} 
	
	public String getPassword() {
		return this.password;
	}
	
	public String getUserName() {
		return this.name;
	}
	
	public String getName() {
		return name;
	}
	
	public int taxDeducation() {
		Scanner sc=new Scanner(System.in);
		float tax=0;
		if ((this.accountBalance>=10000.0)&&(this.accountBalance<=19999.0)) {
			tax=(float) (this.accountBalance*0.01);
		}
		else if(this.accountBalance>=20000.0) {
			tax=(float) (0.5*this.accountBalance);
		}
		
		System.out.println("Tax for "+this.accountNumber+" is "+tax);
		System.out.println("Do you want to deduct tax? y/n");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			this.accountBalance-=tax;
			System.out.println("Tax Deducted");
			
		}
		
		else {
			System.out.println("Tax Not Deducted");
		}
		
		return 0;
		}

}
