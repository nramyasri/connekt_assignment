
public class StackImplementation {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementation s = new StackImplementation();
	        s.push(10);
	        s.push(20);
	        s.push(30);
	        s.pop();
	        System.out.println(s.pop() + " Popped from stack");
		
		
		

	}
	
	private static class stackNode<Integer>{
		private int data;
		private stackNode<Integer> next;
		
		public stackNode(int data) {
			
			this.data=data;
		}
		
		
	}
	
	private stackNode<Integer> top;

	
	public int pop() {
		
		int item=top.data;
		top=top.next;
		
		return item;
		
	}
	
	public void push(int item) {
		
		stackNode newStack=new stackNode<>(item);
		newStack.next=top;
		top=newStack;
		
		
	}
}
