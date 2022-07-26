package complexnumber;


public class staticStack extends classStack{
	
	
	int top;
	int arrSize;
	private int[] stack;
	
	public staticStack(int size) {
		this.arrSize=size;
		top=-1;
		stack=new int[this.arrSize];
	}
	
	@Override
	public void push(int value) {
		if(top<this.arrSize-1){
			stack[++top]=value;
			System.out.println("Element "+value+" pushed successfully");
			
		
		}
		
		else {
			System.out.println("Stack is full");
			
		}
	}

	@Override
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;

		}
		else {
			System.out.println("Element "+stack[top]+" poped successfully");
			return --top;
		}
	}

	@Override
	public void display() {
		
		if(top>=0) {
			System.out.println("Stack content");
			for(int i=top;i>-1;i--) {
				System.out.print(stack[i]+" ");
				
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
