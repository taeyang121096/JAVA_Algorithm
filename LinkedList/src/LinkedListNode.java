/* 첫번째 값도 삭제 할 수 있는 단방향 리스트 구현  */
public class LinkedListNode {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(2);
		ll.append(4);
		ll.delete(1);
		ll.retrieve();
	}

}

class LinkedList {
	Node header;

	static class Node {
		int data;
		Node next = null;
	}

	LinkedList() {
		header = new Node();
	}
	
	/* 삽입 */

	void append(int data) {
		Node end = new Node();
		end.data = data;
		Node n = header;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	/* 삭제 */
	void delete(int data) {
		Node n = header;
		while (n.next != null) {
			if (n.next.data == data) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}

	}
	/* 출력 */

	void retrieve() {
		Node n = header.next;
		while (n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);

	}

}
