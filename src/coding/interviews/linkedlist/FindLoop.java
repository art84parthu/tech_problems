package coding.interviews.linkedlist;

public class FindLoop{
	public static boolean hasLoop(Node head){
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.getNext() != null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if(slow == fast || slow == fast.getNext()){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args){
		//Create a list with loop. 
	}
}