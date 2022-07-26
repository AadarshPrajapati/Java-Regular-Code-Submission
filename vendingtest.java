package complexnumber;

public class vendingtest {

	public static void main(String[] args) {
		int curr[] = {1,5,10,20,50,100};
		int curr_count[] = {12, 1, 2, 33, 23, 3};
		String prod[] = {"Candy", "Snacks", "Nuts", "Coke", "Pepsi","Soda"};
		int prod_count[] = {10, 10, 10, 10, 10, 10};
		
		vendingmachine obj = new vendingmachine(curr, curr_count, prod, prod_count);
		obj.insert();
		obj.enterProduct();
		

	}

}