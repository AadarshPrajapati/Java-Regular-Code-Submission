package complexnumber;

public class tictactoe {

	public static void main(String[] args) { 
		String comb="|  |  |  |";
		String bottom="+--+--+--+";
		for(int i=0;i<4;i++) {
			System.out.println(bottom);
			if(i!=3) {
			System.out.println(comb);
			}
			else {
				break;
			}
		}

	}

}
