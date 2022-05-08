package assignment4;
import java.util.Random;
import java.util.*;

public class guessGame {

	protected int count=0;
	protected String name;
	protected int guess;
	
	public guessGame(String name) {
		this.name=name;
	}
	
	public int play() {
		Scanner sc=new Scanner(System.in);
		Random rand = new Random(); 
		int low = 1;
		int high = 11;
		int result = rand.nextInt(high-low) + low;
		System.out.println("Now its "+this.name+" turn ");
		do {
			System.out.println("Guess the number");
			this.guess=sc.nextInt();
			this.count+=1;

			if(guess<result){
				System.out.println("number is greater then guessed");
			}
			else if(guess>result){
				System.out.println("number is smaller then guessed");
			}
			else{

			}
			
		}while(guess!=result);
		
		System.out.println("You guessed right");
		return this.count;
	}
	

}
