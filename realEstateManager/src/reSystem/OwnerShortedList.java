package reSystem;

import list.*;

public class OwnerShortedList extends SortedList{
	
	public OwnerShortedList() {
		super();
	}
	
	public Item search(String key) {
		Node tmpNode= head;
		boolean c=false;
		
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new String(key))){
				c=true;
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		
		if(c==false && head!=null) {
			System.out.println("Incorrect afm, please try again.");
		}
		if(head==null) {
			System.out.println("List is empty!");
		}
		
		return null;
	}
	
}
