package list;

public class SortedList extends List {
	
	public Node insert(Item a) {
		Node tmp = new Node(a);
		length++;
		Node n1 = head;
		Node n2 = head;
		
		while((n1 != null) && (n1.getValue().less(a))) {
			n2=n1;
			n1=n1.getNext();
		}
		
		if (n1 == head) {
			tmp.setNext(n1);
			head = tmp;
		} else {
			n2.setNext(tmp);
			tmp.setNext(n1);
		}
		return head;
	}
	
}
