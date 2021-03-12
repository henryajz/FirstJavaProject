package reSystem;

import list.*;
import reSystem.models.Certificates.*;
import reSystem.models.owners.Owner;
import reSystem.models.realEstates.*;


public class CertShortedList extends SortedList{
	
	public CertShortedList() {
		super();
	}
	
	public Item search(String key) {
		Node tmpNode= head;
		while (tmpNode != null){
			if (tmpNode.getValue().key().equals(new String(key))){
				return tmpNode.getValue();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}

	
	public Item searchByRealEstate(RealEstate re) {
		Node tmpNode= head;
		OwnershiCert ows;
		
		
		while (tmpNode != null){
			ows=(OwnershiCert) tmpNode.getValue().getData();
			
			
			if (ows.getRe().equals(re)){
				tmpNode.getValue().print();
			}
			tmpNode = tmpNode.getNext();
		}
		return null;
	}
	
	public Item searchByOwner(Owner ow) {
		Node tmpNode= head;
		OwnershiCert ows;
		
		while (tmpNode != null){
			ows=(OwnershiCert) tmpNode.getValue().getData();
			if (ows.getOwner()!=null)
				if (ows.getOwner().equals(ow)){
				 tmpNode.getValue().print();
				 
				}
			tmpNode = tmpNode.getNext();
		}

		return null;
	}
	
	public double ReturnTotalEstate(Owner ow) {
		Node tmpNode= head;
		OwnershiCert ows;
		double estate =0;
		
		while (tmpNode != null){
			ows=(OwnershiCert) tmpNode.getValue().getData();
			
			if (ows.getOwner().getAfm().equals(ow.getAfm())){
				 estate += ows.getRe().getTotalCost();
			}
			tmpNode = tmpNode.getNext();
		}
		return estate;
	}
	
	public double ReturnTaxes(Owner ow) {
		Node tmpNode= head;
		OwnershiCert ows;
		double taxes = 0;
		
		while (tmpNode != null){
			ows=(OwnershiCert) tmpNode.getValue().getData();
			if(ows.getOwner()!=null)
				if (ows.getOwner().equals(ow)){
					taxes += (ows.getRe().getTotaltax())*(ows.getPercentage()/100);
				}
				tmpNode = tmpNode.getNext();
		}
		return taxes;
	}
}