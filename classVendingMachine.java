package assignment4;
import java.util.*;
import java.time.*;

public class classVendingMachine extends classTranscationVending {
	
	protected int currency[];
	protected int countCurrency[];
	protected String productName[];
	protected int productCount[];
	protected int productRate[];
	protected int productCode[];
	protected int customer_total_money,fixed_bill_money;
	protected int flag,pindex,tempflag=0;
	protected int remaning_amt=0;
	protected String customer_name;
	protected String  contact_number;
	public classVendingMachine(int curr[], int countCurr[], String pNames[], int pCount[],int pRate[],int pCode[]) {
		
		this.currency=curr;
		this.countCurrency=countCurr;
		this.productName=pNames;
		this.productCount=pCount;
		this.productRate=pRate;
		this.productCode=pCode;
		customer_total_money=0;
		this.tempflag=0;
	}

	public void insert() {
		
		// MONEY INSERTION
		Scanner sc=new Scanner(System.in);
		int temp_curr[] = new int[currency.length];
		System.out.println("Enter Your Name First");
		customer_name=sc.next();
		System.out.println("Enter Your Contact Number");
		contact_number=sc.next();
		for(int i=0;i<currency.length;i++) {
			System.out.println("Enter the number of "+currency[i]+" currency, if not press 0");
			temp_curr[i] = sc.nextInt();
			countCurrency[i]+=temp_curr[i]; // for counting current quantity of currency
			fixed_bill_money=customer_total_money+=temp_curr[i]*currency[i]; // calculating total money entered at the same time
		}
		System.out.println("You have given total "+customer_total_money+" to us.");
			
	}
	
	public void buyProduct() {
		// PRODUCT LIST WHICH CAN BE BUYED
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Products available are: ");
		for(int i=0;i<productRate.length;i++) {
			System.out.println((i+1)+"."+" "+productName[i]+" "+"("+productCode[i]+")"+" "+productRate[i]);
		}
		
		do {
			System.out.println("Enter product code you want to buy :");
			int pcode=sc.nextInt();
			for(int i=0;i<productRate.length;i=i+1) {
				if(pcode==productCode[i]) {
					this.pindex=i;
					this.flag=1;
					break;	
				}
			}
			
			if(this.flag==0) {
				System.out.println("Wrong code entered");
			}
			else {
				
				System.out.println("Enter the quantity you want of the product "+productName[this.pindex]+":");
				int pquantity=sc.nextInt();
				if(pquantity > productCount[this.pindex]) {
					System.out.println("Sorry!! we are left with "+productCount[this.pindex]+" quantity.");
				}
				else {
					this.tempflag=1;
					int cost = productRate[this.pindex]*pquantity;
					remaning_amt = customer_total_money - cost;
					if(remaning_amt < 0) {
						System.out.println("Enter "+Math.abs(remaning_amt)+ " Rs. more ");
					}
					else {
						System.out.println("Collect Your "+productName[this.pindex]);
						this.productCount[0] -= pquantity;
						customer_total_money=remaning_amt;
						Clock c = Clock.systemUTC();  
					    Duration d = Duration.ofHours(5);  
					    Clock clock = Clock.offset(c, d);    
					    String time=clock.instant().toString();
					    super.addTranscation("Name "+" "+customer_name+" Phone No. "+contact_number+" "+time+" "+productName[this.pindex]+" "+productRate[this.pindex]*pquantity);
						}
				}
			}
			this.flag=0;
			this.pindex=0;
			System.out.println("Do you want to buy more products ? y/n");
			ch = sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
		
	if(this.tempflag==1) {
		super.bill(fixed_bill_money,remaning_amt,customer_name,contact_number);
		}
	else {
		System.out.println("Collect your Amount of Rs."+customer_total_money);
	}
	}
	
	
	public void reset() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey there enter the passkey to reset vending machine");
		String s=sc.next();
		int k=3;
		int flip=0;
		for(int i=3;i>0;i--) {
			if(s.equals("admin123")) {
				flip=1; 
				System.out.println("Access granted"); 
				break;
			}
			else {
			 System.out.println("No. of attempts left " + (i-1));
			}
		}
		 if(flip==1) {
			System.out.println("You can now reset Stock available and their costs");
			for(int i=0;i<productName.length;i++){ 
				System.out.println("Enter new stock for "+productName[i]); 
				productCount[i]=sc.nextInt();
			}
			
			System.out.println("Every thing is reseted to new values");
			System.out.println("For more system reset contact developer team");	
		}
		else {
			System.out.println("Wrong passkey");
			System.out.println("For more system reset contact developer team");	
		}
		
	}	

}
