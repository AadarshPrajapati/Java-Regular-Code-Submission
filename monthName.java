package complexnumber;
import java.util.*;

public class monthName {
	
	static String[] arr=new String[13];
	
	public static void initial() {
		
		String months="january  february march    april    may      june     july     august  septemberoctober  novemeberdecember ";
		arr[0]=months.substring(0, 9);
		for(int i=1;i<12;i++) {
			arr[i]=months.substring(i*9-1,(i+1)*9-1);	
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		monthName.initial();
		while(true) {
			System.out.println("Enter number btw 1-12");
			int ch=sc.nextInt();
			System.out.println("The month corresponding to "+ch+" is "+monthName.arr[ch-1]);
		}
		
	}

}
