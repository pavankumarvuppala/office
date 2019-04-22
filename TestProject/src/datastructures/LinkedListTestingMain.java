package datastructures;

public class LinkedListTestingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListTest l1 = new LinkedListTest();
		l1.addNodeLast(1);
		l1.addNodeLast(3);
		Node head = l1.addNodeLast(4);

		l1.diplayList();
		
		Node rev = reverseList(head);
		System.out.println("\nHead:"  + head.data);
		
		System.out.println(rev.data);
		while (rev.next != null){
			rev = rev.next;
			System.out.println(rev.data);
			
		}
		
		
	}
	
	public static Node reverseList(Node head){
		Node next =  null;
		
		Node prev = null;
		
		Node current = head;
		
	
		
		while (current != null){
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			
		}
		
		head = prev;
		return head;
		
		
		
	}

}
