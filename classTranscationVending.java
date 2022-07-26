package complexnumber;
import java.io.FileWriter; 
import java.io.IOException;
import java.io.*;

public class classTranscationVending{
	
	

	public void addTranscation(String s){
			
		try {
			  File file=new File("transcation.txt");
		      FileWriter myWriter = new FileWriter(file,true);
		      PrintWriter pw=new PrintWriter(myWriter);
		      myWriter.write(s);
		      myWriter.write("\n");
		      pw.println(s);
		      myWriter.close();
		      pw.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
	public void bill(int cust_money,int rem_amount,String cname,String number) {
		System.out.println("      Name: "+cname);
		System.out.println("      Phone No: "+number);
		
		System.out.println("______________________________");
		System.out.println(" Total amount "+Math.abs(cust_money-rem_amount));
		System.out.println(" Paid by cash");
		System.out.println(" Collect your Amount of Rs."+Math.abs(rem_amount));
		System.out.println("______________________________");
		System.out.println(" Thanks have a nice day!");
		
	}
}