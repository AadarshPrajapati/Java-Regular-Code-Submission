package assignment4;
import java.util.*;


public class classVendingMachineTest {

	public static void main(String[] args) {
		
		int curr[] = {1,5,10,20,50,100};
		int curr_count[] = {5,5,5,5,5,5};
		String prod[] = {"Candy", "Snacks", "Nuts", "Coke", "Pepsi","Soda"};
		int prod_count[] = {10, 10, 10, 10, 10, 10};
		int prod_rate[]= {10,50,90,25,35,45};
		int prod_code[]= {130,135,034,323,532,632};
		
		classVendingMachine obj=new classVendingMachine(curr,curr_count,prod,prod_count,prod_rate,prod_code);
		while(true) {
		System.out.println("1.Buy Product \n2.RESET VENDING MACHINE");
		Scanner sc=new Scanner(System.in);
		switch(sc.nextInt()) {
		case 1:	obj.insert();
				obj.buyProduct();
				break;
		case 121123:obj.reset();
			break;
			
		default:System.out.println("Choose Option Wisely ");
			}
		}

	}
}

