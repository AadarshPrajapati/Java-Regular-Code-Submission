package complexnumber;
import java.util.*;

public class bankTest {

	public static void main(String[] args) {
		classBank b=new classBank();
		char ch;
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			System.out.println("WELCOME TO BANK"); 
			System.out.println("\n1.Bank Zone \n2.User Zone");
			System.out.println("Enter Your Choice");
			int choice1=sc.nextInt();
			if(choice1==1) {
				System.out.println("Enter Bank Id ");
				String id=sc.next();
				System.out.println(" Enter The Password");
				String password=sc.next();
				if(id.equals("12527")&&password.equals("admin1234")) {
					System.out.println("WELCOME TO BANK ZONE"); 
					do {
						System.out.println("\n1.AddAccount in Bank" + "\n2.Get Total balance in Bank" + "\n3.Get account detail with max. and min. balance \n4.Find an account \n5.No. of accounts having atleast specific balance\n6.Tax Deducation");
						System.out.println("Enter Your Choice");
						int choice2=sc.nextInt();
						switch(choice2) {
						case 1:b.addAccount();
							break;
						case 2:b.getTotalBalance();
							break;
						case 3:b.getMaxMinBalance();
							break;
						case 4:System.out.println("Enter The Account Number");
							String accountt=sc.next();
							b.findAccount(accountt);
							break;
						case 5:b.countAccountSpecificBalance();
							break;
						case 6:	System.out.println("Enter Account Number ");
							String account=sc.next();
							int index=b.findAccountLogin(account);
							b.taxdeduct(index);
							break;
						default:System.out.println("Invalid Choice");
						}
						
						System.out.println("Do You Want To Continue Yes/No ");
						ch=sc.next().charAt(0);
				}while(ch=='y'||ch=='Y');
			}
				else {
					System.out.println("Maybe Id or Password is Wrong , contact admin");
				}
		}
			else if(choice1==2) {
			
				System.out.println("Enter Account Number ");
				String account=sc.next();
				int temp=b.findAccountLogin(account);
				if(temp!=-1) {
					System.out.println(" Enter The Password");
					String password=sc.next();
					int login=b.findPasswordLogin(temp, password);
					if(login==1) {
						System.out.println("WELCOME "+b.findUserName(temp));
						do {
							System.out.println("1.Add Balance \n2.Withdraw Money \nEnter Your Choice");
							int choice2=sc.nextInt();
							switch(choice2) {
							case 1:int result1=b.addbalance(temp);
									if(result1==1) {
										System.out.println("Money desposited");
									}
									else {
										System.out.println("Try later , our server is down");
									}
								break;
							case 2:int result2=b.withdrawbalance(temp);
								if(result2==1) {
									System.out.println("Money Withdrawm");
								}
								else {
									System.out.println("Try later , our server is down");
								}
									
							}
							System.out.println("Do You Want To Continue Yes/No ");
							ch=sc.next().charAt(0);
						}while(ch=='y'||ch=='Y');
					}
					
					else {
						System.out.println("Password is wrong");
					}
				
				}
				else {
					System.out.println("Account Doesn't Exist");
				}
		
			}
		
		}
	}
}
