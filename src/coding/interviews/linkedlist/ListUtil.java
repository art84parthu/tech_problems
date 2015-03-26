package coding.interviews.linkedlist;

public class ListUtil {
	public static void printList(Node head){
		System.out.print("\n{");
		while(head.getNext() != null){
			System.out.print(head.getValue() + ",");
			head = head.getNext();
		}
		System.out.print(head.getValue() + "}");
	}
}
