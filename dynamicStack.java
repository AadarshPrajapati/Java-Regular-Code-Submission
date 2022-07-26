package complexnumber;

import java.util.ArrayList;

public class dynamicStack extends classStack{
	
	private ArrayList<Integer> stack;
	private int top;

	public dynamicStack() {
		
		stack=new ArrayList<Integer>();
		top=-1;
		
	}

	@Override
	public void push(int value) {
		stack.add(value);
		top+=1;
		System.out.println("Element "+value+" pushed successfully");
		
	}

	@Override
	public int pop() {
		if(top==-1) {
		System.out.print("Stack Is Empty");
		return -1;
	}
		else {
			
			System.out.println("Element "+stack.get(top)+" poped successfully");
			stack.remove(top);
			return --top;
		}
	}

	@Override
	public void display() {
		if(top>=0) {
			System.out.println("Stack content");
			for(int i=top;i>-1;i--) {
				System.out.print(stack.get(i)+" ");
				
			}
		}
		else {
			System.out.println("Stack Is Empty");
		}

	}
	
	public void clear() {
		top=-1;
		System.out.println("Stack Cleared");
	}
}
