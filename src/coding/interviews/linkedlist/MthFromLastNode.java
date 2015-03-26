package coding.interviews.linkedlist;

public class MthFromLastNode {
	
	/*
	 * mth from last in a singly linked list
	 */
	public static int mthFromLast(int m, Node head){
		if(head == null) return -1;
		
		Node mthNode = head;
		int cnt = 1;
		while(mthNode.getNext() != null){
			if(cnt == m){
				break;
			}
			cnt++;
			mthNode = mthNode.getNext();
		}
		if(cnt < m){
			return -1;
		}
		
		Node first = head;
		while(mthNode.getNext() != null){
			first = first.getNext();
			mthNode = mthNode.getNext();
		}
		
		return first.getValue();
	}
	
}
