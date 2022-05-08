package assignment4;
import java.util.*;

public class guessGameTest {

	public static void main(String[] args) {
		int[] a=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<3;i++) {
			System.out.println("Enter player"+i+" name");
			guessGame G=new guessGame(sc.next());
			a[i]=G.play();
		}
		
		int small=a[1];
		int temp=1;
		for(int i=2;i<4;i++) {
			if(a[i]<small) {
				small=a[i];
				temp=i;
			}
		}
		
		System.out.print("player"+(--temp)+"wins");
	}
	

}
