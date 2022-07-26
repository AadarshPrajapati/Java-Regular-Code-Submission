package complexnumber;
import java.util.*;

public class vendingmachine {
	
	private int currency[];
	private int countCurrency[];
	
	private String item[];
	private int itemCount[];
	private int totalMoney;
	
	vendingmachine(int curr[], int countCurr[], String pNames[], int pCount[] ){
		this.currency = curr;
		this.countCurrency = countCurr;
		this.item = pNames;
		this.itemCount = pCount;
		totalMoney = 0;
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,5,10,20,50,100};
		int temp_curr[] = new int[6];
		
		int i =0;
		while(i<6) {
			System.out.println("Enter the number of "+a[i]+" currency, if not press 0");
			temp_curr[i++] = sc.nextInt();
		}
		
		i = 0;
		while(i<6) {
			totalMoney += temp_curr[i]*a[i];
			i++;
		}
		
		System.out.println("Total amount is: "+totalMoney);
		
		
		}
	
	public void enterProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Products available are: ");
		System.out.println("1.Candy 101 ₹10 \n2.Nuts 130 ₹90\n3.Coke 145 ₹25\n4.Pepsi 167 ₹35\n5.Snacks 007 ₹50\n6.Soda 010 ₹45");
		
		int iter = 0;
		while(iter != -1) {
		System.out.println("Choose your product: Enter code ");
		int choice = sc.nextInt();
		switch(choice) {
		case 101:{
			System.out.println("Select the quantities of Candy: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[0]) {
				int net = this.itemCount[0] - quantity;
				System.out.println("Sorry!! we are left with "+Math.abs(net)+" quantity.");
			}
			else {
				int cost = (10*quantity);
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
				   
					System.out.println("Collect Your Candies");
					this.itemCount[0] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
				
			}
			}
			break;
		}
		case 007:{
			System.out.println("Select the quantities of Snacks: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[1]) {
				int net = this.itemCount[1] - quantity;
				System.out.println("Sorry!! we are left with "+Math.abs(net)+" quantity.");
			}
			else {
				int cost = (50*quantity);
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
					
					System.out.println("Collect Your Snacks");
					this.itemCount[1] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
				
				}
			}
			break;
		}
		case 130:{
			System.out.println("Select the quantities of Nuts: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[2]) {
				int net = this.itemCount[2] - quantity;
				System.out.println("Sorry!! we are left with "+(int)Math.abs(net)+" quantity.");
			}
			else {
				int cost = 90*quantity;
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
					
					System.out.println("Collect Your Nuts");
					this.itemCount[2] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
					
				}
			}
			break;
		}
		case 145:{
			System.out.println("Select the quantities of Coke: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[3]) {
				int net = this.itemCount[3] - quantity;
				System.out.println("Sorry!! we are left with "+Math.abs(net)+" quantity.");
			}
			else {
				int cost = 25*quantity;
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
					System.out.println("Collect Your Coke");
					this.itemCount[3] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
					
				}
			}
			break;
		}
		case 167:{
			System.out.println("Select the quantities of Pepsi: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[4]) {
				int net = this.itemCount[4] - quantity;
				System.out.println("Sorry!! we are left with "+Math.abs(net)+" quantity.");
			}
			else {
				int cost = 35*quantity;
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
					
					System.out.println("Collect Your Pepsi");
					this.itemCount[4] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
					
				}
			}
			break;
		}
		case 010:{
			System.out.println("Select the quantities of Soda: ");
			int quantity = sc.nextInt();
			if(quantity > this.itemCount[5]) {
				int net = this.itemCount[5] - quantity;
				System.out.println("Sorry!! we are left with "+Math.abs(net)+" quantity.");
			}
			else {
				int cost = (45*quantity);
				int remaning_amt = totalMoney - cost;
				if(remaning_amt < 0) {
					System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
				}
				else {
					
					System.out.println("Collect Your Soda");
					this.itemCount[5] -= quantity;
					System.out.println("Collect your Amount of "+remaning_amt+" Rs.");
					
				}
			}
			break;
		}
		default:
			System.out.println("Wrong choice");
		}
		
		System.out.println("Do you want to chooseanything else? if yes press 0 else press -1");
		iter = sc.nextInt();
		}
		
		System.out.println("Thanks , have a nice day!!");
	}
}