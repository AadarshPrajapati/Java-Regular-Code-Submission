package assignment4;
import java.util.*;

public class SodaCanTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height and diameter in cm");
		SodaCan S=new SodaCan(sc.nextFloat(),sc.nextFloat());
		S.getVolumne();
		S.getSurfaceArea();

	}

}
