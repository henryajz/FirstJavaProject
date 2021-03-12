package list;


public class Node {
	private Item data;
	private Node next;

	public Node(Item dat) {
		data = dat;
	}

	public Node(Item dat, Node b) {
		data = dat;
		next = b;
	}

	public void print() {
		data.print();
	}

	public Item getValue() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
