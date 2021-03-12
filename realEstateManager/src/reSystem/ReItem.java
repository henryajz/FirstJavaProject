package reSystem;

import	list.Item;
import reSystem.models.realEstates.*;

public class ReItem extends Item {
	private RealEstate re;
	
	public ReItem(RealEstate realEstate) {
		this.re=realEstate;
	}
	
	public Object key() {
		return re.getCode();
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
		return re.toString();
	}
	
	public void print() {
		re.Print();
	}
	
	public Object getData() {
		return this.re;
	}
}
