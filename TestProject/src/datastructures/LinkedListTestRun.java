package datastructures;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LinkedListTestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Time in Milliseconds: " + System.nanoTime());
		long t1 = System.nanoTime();
		LinkedListTest l = new LinkedListTest();
		Node head = l.addNodeLast(1);
		l.addNodeLast(2);
		l.addNodeLast(3);
		l.addNodeLast(4);
		l.addNodeLast(5);
		l.diplayList();

		// l.removeFromTail();

		// l.diplayList(head);
		l.addNodeAtPosition(5, 7);
		l.addNodeAtPosition(5, 7);

		l.diplayList();

	}

}

class LinkedListTest {

	Node head = null;
	static int size = 0;

	void addNodeAtPosition(int i, int j) {
		// TODO Auto-generated method stub
		if (this.head == null) {
			Node n = new Node();
			head = n;
			head.data = j;
			// System.out.println("tem node " + head.data);
			size++;
		}

		else {
			Node newNode = new Node();
			newNode.data = j;
			Node tmp = this.head;
			Node prev = tmp;
			if (i == 0) {
				newNode.next = tmp;
				this.head = newNode;
				size++;

			} else {
				System.out.println("i = " + i);

				while (i >= 1) {
					try {
						prev = tmp;
						tmp = tmp.next;
					} catch (NullPointerException np) {
						System.out.println("specified position is not in range of list");
					}
					i--;

				}
				//System.out.println("i = " + i);
			}
			if (prev != null) {
				prev.next = newNode;
				newNode.next = tmp;
				size++;

			}
		}

	}

	Node addNodeLast(int data) {
		if (this.head == null) {
			Node n = new Node();
			head = n;
			head.data = data;
			// System.out.println("tem node " + head.data);
			size++;
		} else {
			Node adNode = new Node();
			adNode.data = data;
			adNode.next = null;

			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = adNode;
			size++;
		}
		return head;
	}

	void diplayList() {

		if (this.head == null) {
			System.out.println("List is empty");
		} else {
			Node tmp = this.head;
			while (tmp.next != null) {
				System.out.print(tmp.data + "--> ");
				tmp = tmp.next;
			}
			System.out.println(tmp.data + "--> ");
		}
		System.out.println("Size : " + LinkedListTest.size);
	}

	Node removeFromTail() {

		if (this.head == null) {

		} else if (this.head.next == null) {
			System.out.println(this.head.next);
			this.head = null;
			size--;
		} else {

			Node tmp = this.head;
			Node prev = tmp;
			while (tmp.next != null) {

				prev = tmp;
				tmp = tmp.next;
			}

			prev.next = null;
			size--;

		}
		return this.head;

	}

}

 class Node {
	int data;
	Node next;
}