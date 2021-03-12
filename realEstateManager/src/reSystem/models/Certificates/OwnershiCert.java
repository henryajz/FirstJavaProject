package reSystem.models.Certificates;

import java.util.Date;

import reSystem.models.owners.*;
import reSystem.models.realEstates.*;


public class OwnershiCert {
	private String code;
	private Date crDate;
	private RealEstate re;
	private Owner owner;

	private int choice;
	private float percentage;
	private String ownership;
	
	public OwnershiCert(String code, Date crDate, RealEstate re, Owner owner, float percentage ,int choice) {
		this.code=code;
		this.crDate=crDate;
		this.re=re;
		this.owner=owner;

		this.percentage=percentage;
		this.choice=choice;
		
		if(choice==1) {
			this.ownership="Complete OwnerShip.";
		}
		if(choice==2)
			this.ownership="Petty ownership";
		else
			this.ownership="Usufruct ownership.";
		
	}
	
	//Getters
	public String getCode() {
		return code;
	}

	public Date getCrDate() {
		return crDate;
	}

	public RealEstate getRe() {
		return re;
	}

	public Owner getOwner() {
		return owner;
	}

	public float getPercentage() {
		return percentage;
	}
	
	public int getChoice() {
		return choice;
	}	

	public String getOwnership() {
		return ownership;
	}

	
	
	public void print() {
		System.out.println("_________________________________________");
		System.out.println("Certificate info.\n");
		System.out.println(this.toString());
		System.out.println();
		owner.Print();
		re.Print();
		
	}
	
	public  String toString() {
		return "Certificate code: "+getCode()+"\n"+"Creation date: " +getCrDate()+"\n"
		+"\n"+"Percentage: "+getPercentage()+"\n"+getOwnership();
	}

}
