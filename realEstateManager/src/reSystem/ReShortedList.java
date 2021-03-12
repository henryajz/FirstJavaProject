package reSystem;

import list.*;

public class ReShortedList extends SortedList{
	
	public ReShortedList() {
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
			System.out.println("Incorrect code, please try again.");
		}
		if(head==null) {
			System.out.println("List is empty!");
		}
		
		return null;
	}
	
	public boolean searchboolean(String key) {
		Node tmpNode= head;
		boolean c=false;
		
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new String(key))){
				c=true;
			}
			tmpNode = tmpNode.getNext();
		}
		return c;
	}
	
	public void PrintItemsInHierarchy(String className) {
		Node tmpNode = head;
		
			try{
				while (tmpNode!=null){
					Item item = tmpNode.getValue();
					if(Class.forName("reSystem.models.realEstates."+className).isInstance(item.getData())){
						System.out.println("_________________________________________");	
						tmpNode.print();
						System.out.println("_________________________________________");	
					}
					tmpNode=tmpNode.getNext();
				}
				
			}
			catch (ClassNotFoundException ex){
				System.out.println("This Real estate does not exist, Please try again.");
				return ;
			}
		
	}
	
}
