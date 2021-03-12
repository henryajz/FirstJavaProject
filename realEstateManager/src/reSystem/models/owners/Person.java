package reSystem.models.owners;

import java.util.Date;

public class Person extends Owner {
	private String address;
	private Date birthDate;
	
	//Constructor
	public Person(String name, String afm, String address, Date birthDate) {
		super(name, afm);
		
		this.address=address;
		this.birthDate=birthDate;
	}

	//Getters
	public String getAddress() {
		return address;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	
	
	public void Print() {
		System.out.println("Personal Owner info."+"\n");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Name: "+getName() +"\nAfm: "+getAfm() +"\nAddress: "+getAddress() 
			+"\nBirth date: " +getBirthDate();
	}
}
