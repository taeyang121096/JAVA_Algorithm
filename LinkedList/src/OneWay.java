
public class OneWay {
	public static void main(String[] args) {

		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.delete(3);
		head.append(4);
		head.retrieve();

	}

}

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}

	void append(int data) {
		Node n = this;
		Node end = new Node(data);
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	void delete(int data) {
		Node n = this;

		while (n.next != null) {
			if (n.next.data == data) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}

	}

	void retrieve() {
		Node n = this;
		while (n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);

	}
}
