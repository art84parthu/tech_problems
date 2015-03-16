package coding.interviews.linkedlist;

public class SinglyLinkedList {

	private Node head;
	private Node tail;
	
	
	public SinglyLinkedList(){
		head = tail = null;
	}
	
	public boolean insertElement(int position, int value){
		
		int pos = 0;
		Node cur = head;
		Node prev = null;
		Node elem = new Node(value, cur);
		while(cur != null){
			if(pos == position){
				elem = new Node(value, cur);
				if(prev != null){
					prev.setNext(elem);
				}
				if(pos == 0){
					head = elem;
				}
				return true;
			}
			pos++;
			prev = cur;
			cur = cur.getNext();
			
		}
		
		if(position == 0 && pos == position){
			elem = new Node(value, cur);
			if(head == tail && head == null){
				head = tail = elem;
			}
			return true;
		}
		if(pos == position && prev == tail && tail != null){
			elem = new Node(value, cur);
			prev.setNext(elem);
			tail = elem;
			return true;
		}
		return false;
	}
	
	
}
				
				
				