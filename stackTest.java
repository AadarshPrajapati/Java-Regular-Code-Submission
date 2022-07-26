package complexnumber;
import java.util.*;

public class stackTest {
	
	public static void main(String[] args) {
		while(true) {
			char ch;
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Static Stack\n2.Dynamic Stack\nEnter Your Choice");
			int choice=sc.nextInt();
			if (choice==1) {
				System.out.println("Enter the size of stack you want");
				int length=sc.nextInt();
				staticStack S=new staticStack(length);
				
				do {
					System.out.println("1.Push Element\n2.Pop Element\n3.Clear Stack\n4.Display stack\nEnter Your Choice ");
					choice=sc.nextInt();
					switch(choice) {
					case 1:System.out.println("Enter Value You Want To Push");
						int val=sc.nextInt();
						S.push(val);
						break;
					case 2:S.pop();
						break;
					case 3:S.clear();
						break;
					case 4:S.display();
						break;
					default:System.out.println("Invalid Input");
					}
					
				System.out.println("Do You Want To Continue Yes/No ");
				ch=sc.next().charAt(0);
				}while(ch=='y'||ch=='Y');
			
	
			}
			
			if (choice==2) {
				dynamicStack D=new dynamicStack();
				do {
					System.out.println("1.Push Element\n2.Pop Element\n3.Clear Stack\n4.Display Stack\nEnter Your Choice ");
					choice=sc.nextInt();
					switch(choice) {
					case 1:System.out.println("Enter Value You Want To Push");
						int val=sc.nextInt();
						D.push(val);
						break;
					case 2:D.pop();
						break;
					case 3:D.clear();
						break;
					case 4:D.display();
						break;
					default:System.out.println("Invalid Input");
					}
					
				System.out.println("Do You Want To Continue Yes/No ");
				ch=sc.next().charAt(0);
				}while(ch=='y'||ch=='Y');
			}
			else {
				System.out.println("Invalid Input");
			}
			
		}
	}

}