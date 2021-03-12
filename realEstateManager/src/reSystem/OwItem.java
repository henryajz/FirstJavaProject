package reSystem;

import list.Item;
import reSystem.models.owners.*;

public class OwItem extends Item {
	private Owner owner;
	
	public OwItem(Owner ow) {
		this.owner=ow;
	}
	
	public Object key() {
		return owner.getAfm();
	}
	
	public boolean equals(Item o) {
		return key().equals(o.key());
	}
	
	public boolean less(Item o) {
		if(((String)key()).compareTo((String) o.key()) < 0)
			return true;
		return false;
	}
	
	public String toString() {
		return owner.toString();
	}
	
	public void print() {
		owner.Print();
	}
	
	public Object getData() {
		return this.owner;
	}
}
