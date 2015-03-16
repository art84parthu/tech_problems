package coding.interviews.linkedlist;

public class Node {
	private int value;
	private Node next;
	
	Node(int value, Node node){
		this.value = value;
		this.next = node;
	}
	
	
	public void print(){
		do{
			System.out.println(this.value + " -> ");
		}while (this.next != null);
		
		System.out.println("X");
	}
	
	public int getValue(){
		return value;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node elem){
		this.next = elem;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	
}
