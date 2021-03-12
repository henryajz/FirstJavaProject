package reSystem;

import list.Item;
import reSystem.models.Certificates.*;


public class CertItem extends Item {
	private OwnershiCert cert;
	
	public CertItem(OwnershiCert oc) {
		this.cert=oc;
	}
	
	public Object key() {
		return cert.getCode();
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
		return cert.toString();
	}
	
	public void print() {
		cert.print();
	}
	
	public Object getData() {
		return this.cert;
	}
}
