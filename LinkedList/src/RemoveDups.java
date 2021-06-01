/* 정렬되어 있지 않은 LinkedList, 중복값 제거 (단 버퍼 사용하지 않고) */

public class RemoveDups {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.append(1);
		ll.append(1);
		ll.retrieve();
		ll.removeDups();
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
	/* 중복 제거 */
	void removeDups() {
		Node n = header;
		while(n != null && n.next != null) {
			Node r = n;
			while(r.next != null) {
				if (n.data == r.next.data) {
					r.next = r.next.next;
				}else {
					r = r.next;
				}
			}
			n = n.next;
		}
	}

}
