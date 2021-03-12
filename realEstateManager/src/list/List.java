package list;

public class List {
	protected Node head;
	protected int length;
	
	public List() {
		head=null;
		length=0;
	}
	
	public Node insert(Item a) {
		length++;
		head= new Node(a, head);
		return head;
	}
	
	public void print() {
		int tmp=0;
		
		for (Node tmp2 = head; tmp2 != null; tmp2 = tmp2.getNext()) {
			System.out.print("[" + tmp + "] ");
			tmp2.print();
			System.out.println("_________________________________________");
			tmp++;
		}
		if (tmp == 0) {
			System.out.println("Empty List...");
		} else {
			System.out.println("==================================");
		}	
	}
	
	public Node search(Item a) {
		for (Node tmp = head; tmp != null; tmp = tmp.getNext()){
			if (a.equals(tmp.getValue())){
				return tmp;
			}
		}
		return null;
	}
	
}
