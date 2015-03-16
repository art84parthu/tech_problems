package coding.interviews.linkedlist;

public class Stack {

	private Node top;
	
	public Stack(){
		top = null;
	}

	public int pop(){
		int value = top.getValue();
		top = top.getNext();
		
		return value;
	}
	
	
	public void push(int value){
		Node newTop = new Node(value, top);
		top = newTop;
	}
	
}
