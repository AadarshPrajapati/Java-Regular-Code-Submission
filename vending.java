package complexnumber;

import java.io.*; 
import java.util.Scanner; 


public class vending {
	
	private int one_count,five_count,ten_count,twenty_count,fifty_count,hundred_count;
	private int candy_stock,snacks_stock,nuts_stock,coke_stock,pepsi_stock,soda_stock;
	private int amount;
	private int temp_currency[]=new int[6];
	

	public vending() {
		
		this.one_count=5;
		this.five_count=5;
		this.ten_count=5;
		this.twenty_count=5;
		this.fifty_count=5;
		this.hundred_count=5;
		this.candy_stock=10;
		this.snacks_stock=10;
		this.nuts_stock=10;
		this.coke_stock=10;
		this.pepsi_stock=10;
		this.soda_stock=10;// TODO Auto-generated constructor stub
	}
	
	public void insert() {
		
		System.out.println("Enter the number of 1,5,10,20,50,100 notes you have");
		Scanner sc=new Scanner(System.in);
		int [] a= {1,5,10,20,50,100};
		int temp_currency[]=new int[6];
		for(int i=0;i<6;i++) {
			System.out.println("Enter"+a[i]+"rupees currency , if don't press 0");
			this.temp_currency[i]=sc.nextInt();
			
		}
		
		this.one_count+=this.temp_currency[0];
		this.five_count+=this.temp_currency[1];
		this.ten_count+=this.temp_currency[2];
		this.twenty_count+=this.temp_currency[3];
		this.fifty_count+=this.temp_currency[4];
		this.hundred_count+=this.temp_currency[5];
		
		for(int i=0;i<6;i++) {
			this.amount=this.temp_currency[i]*a[i];
			
		}
		System.out.println("Your total money is"+this.amount);
		
	}
	
	public void whatYouWant() {
		System.out.println("1.Candy 101 \n2.Nuts 130\n3.Coke 145\n.4.Pepsi 167\n5.Snacks 007\n6.Soda 010");
		System.out.println("Enter Code");
		Scanner sc=new Scanner(System.in);
		int selected=sc.nextInt();
		if (selected==101) {
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			if (quantity>this.candy_stock) {
				System.out.println("Sorry we have only "+this.candy_stock+"left with us");
			}
			else {
				int total_charges=10*quantity;
				int amount_left=this.amount-total_charges;
				if (amount_left<0) {
					System.out.println("Enter more money");
				}
				else {
				System.out.println("Collect your candies");
				this.candy_stock=this.candy_stock-quantity;
				System.out.println("Collect your cash of "+amount_left);
				
				
				}
				
			}
		}
		
		if (selected==167) {
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			if (quantity>this.pepsi_stock) {
				System.out.println("Sorry we have only "+this.pepsi_stock+"left with us");
			}
			else {
				int total_charges=10*quantity;
				int amount_left=this.amount-total_charges;
				if (amount_left<0) {
					System.out.println("Enter more money");
				}
				else {
				System.out.println("Collect your pepsi");
				this.candy_stock=this.pepsi_stock-quantity;
				System.out.println("Collect your cash of "+amount_left);
				
				
				}
				
			}
		}
		
		if (selected==007) {
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			if (quantity>this.snacks_stock) {
				System.out.println("Sorry we have only "+this.snacks_stock+"left with us");
			}
			else {
				System.out.println("Collect your snacks");
				this.candy_stock=this.snacks_stock-quantity;
			}
		}
		
		if (selected==010) {
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			if (quantity>this.soda_stock) {
				System.out.println("Sorry we have only "+this.soda_stock+"left with us");
			}
			else {
				System.out.println("Collect your soda");
				this.candy_stock=this.soda_stock-quantity;
			}
		}
		
		
	}
	
	public void cancelOrder() {
		System.out.println("Are you sure to cancel the item 1 for Yes , 0 for No");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if (choice==1) {
			this.one_count-=this.temp_currency[0];
			this.five_count-=this.temp_currency[1];
			this.ten_count-=this.temp_currency[2];
			this.twenty_count-=this.temp_currency[3];
			this.fifty_count-=this.temp_currency[4];
			this.hundred_count-=this.temp_currency[5];
			System.out.println("Collect your money , thanks have a nice day !");
		}
		
		else {
			whatYouWant();
		}
	}
	
	public void reset() {
		System.out.println("Enter the code to reset the vending machine ");
		Scanner sc=new Scanner(System.in);
		int passkey=sc.nextInt();
		if (passkey==123123) {
			System.out.println("Are you sure to cancel the item 1 for Yes , 0 for No");
			int choice=sc.nextInt();
			if (choice==1) {
				System.out.println("RESET DONE");
				
			}
			else {
				System.out.println("NO RESET");
			}
		
				
		}
		else {
			System.out.println("Wrong Passkey");
		}
	}
	
	
}


