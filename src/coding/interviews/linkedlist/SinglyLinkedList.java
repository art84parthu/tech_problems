package coding.interviews.linkedlist;

public class SinglyLinkedList {

	private Node head;
	
	public SinglyLinkedList(){
		head = null;
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
			if(head == null){
				head = elem;
			}
			return true;
		}
		if(pos == position && prev.getNext() == null){
			elem = new Node(value, cur);
			prev.setNext(elem);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		SinglyLinkedList list = new SinglyLinkedList();
		list.insertElement(0, 1);
		list.insertElement(1, 4);
		list.insertElement(1, 1);
		list.insertElement(3, 5);
		list.insertElement(2, 6);
		list.insertElement(5, 8);
		
		
		ListUtil.printList(list.head);
		
		int m = 1;
		System.out.print("\n" + m + "th node from last = ");
		System.out.print(MthFromLastNode.mthFromLast(m, list.head));
	}
	
	
}
				
				
				