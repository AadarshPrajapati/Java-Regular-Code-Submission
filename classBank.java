package complexnumber;
import java.util.ArrayList;
import java.util.*;

public class classBank {
	
	private int local_index,local_index1;
	Scanner sc=new Scanner(System.in);
	private ArrayList<bankAccount> accounts;

	public classBank() {
		accounts = new ArrayList<bankAccount>();
		this.local_index=-1;
		this.local_index1=-1;
	}
	
	public void addAccount() {
		
		System.out.println("Enter The Account Number To Be Added");
		String accnumber=sc.next();
		System.out.println("Enter The Balance In Account Min Rs.500");
		float balance=sc.nextFloat();
		System.out.println("Enter The Name");
		String name=sc.next();
		System.out.println("Set Password");
		String password=sc.next();
		if(balance>=500) {
			bankAccount a=new bankAccount(accnumber,balance,name,password);
			accounts.add(a);
			System.out.println("Account Created Successfully");
		}
		
		else {
			System.out.println("Minimum amount is Rs.500, Enter Rs."+(500-balance)+" more");
			float money=sc.nextFloat();
			bankAccount a=new bankAccount(accnumber,balance+money,name, password);
			accounts.add(a);
			System.out.println("Account Created Successfully");
		}

	}
	
	public void getTotalBalance() {
		float totalbalance=0;
		for(int i=0;i<accounts.size();i++) {
			totalbalance+=accounts.get(i).getBalance();
		}
		
		System.out.println("____________________________________");
		System.out.println("Total Balance Present In Bank Is Rs." + totalbalance);
		System.out.println("____________________________________");
	}
	
	public void getMaxMinBalance() {
		float minimum=accounts.get(0).getBalance();
		float maximum=accounts.get(0).getBalance();
		int location_minimum = 0,location_maximum=0;
		
		for(int i=1;i<accounts.size();i++) {
			if(accounts.get(i).getBalance()<=minimum) {
				minimum=accounts.get(i).getBalance();
				location_minimum=i;
			}
			
			if(accounts.get(i).getBalance()>=maximum) {
				maximum=accounts.get(i).getBalance();
				location_maximum=i;
			}
		}
		
		System.out.println("____________________________________");
		System.out.println("Minimum Balance Account: "+accounts.get(location_minimum).getBalance());
		System.out.println("Account Number: "+accounts.get(location_minimum).getAccount());
		System.out.println("Maximum Balance Account: "+accounts.get(location_maximum).getBalance());
		System.out.println("Account Number: "+accounts.get(location_maximum).getAccount());
		System.out.println("____________________________________");	
	}
	
	public void findAccount(String account) {
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccount().equals(account)) {
				this.local_index=i;
			}
		}
		
		if(this.local_index!=-1) {
			System.out.println("____________________________________");
			System.out.println("Name: "+accounts.get(this.local_index).getName());
			System.out.println("Account Number: "+accounts.get(this.local_index).getAccount());
			System.out.println("Account Balance: "+accounts.get(this.local_index).getBalance());
			System.out.println("____________________________________");	
		}
		
		else {
			System.out.println("Account Doesn't Exist");
		}
	}
	
	public int findAccountLogin(String account) {
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getAccount().equals(account)) {
				this.local_index1=i;
			}
		}
		return local_index1;
	}
	
	public int findPasswordLogin(int index,String passkey) {
		int confirmation=0;
		if(accounts.get(index).getPassword().equals(passkey)) {
			confirmation=1;
		}
		return confirmation;
	}
	
	public String findUserName(int index) {
		return accounts.get(index).getUserName();
	}
	
	public void countAccountSpecificBalance() {
		float specific_balance=500;
		int count=0;
		for(int i=0;i<accounts.size();i++) {
			if(accounts.get(i).getBalance()>specific_balance) {
				count+=1;
			}
		}
		
		System.out.println("____________________________________");
		System.out.println("Accounts With Minimum Specific Balance "+specific_balance+" is "+count);
		System.out.println("____________________________________");
	}
	
	public int addbalance(int index) {
		int flip=0;
		if(flip==0) {
		System.out.println("Enter money want to deposit");
		accounts.get(index).deposit(sc.nextFloat());
		flip=1;
		}
		return flip;
	}
	
	public int withdrawbalance(int index) {
		System.out.println("Enter money want to withdraw");
		int flip=accounts.get(index).withdraw(sc.nextFloat());
		return flip;
	}

	public void taxdeduct(int index) {
		accounts.get(index).taxDeducation();
		
	}
}

