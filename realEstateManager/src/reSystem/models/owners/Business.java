package reSystem.models.owners;

public class Business extends Owner{
	private String location;
	private String busOwner;
	
	//Constructors

	public Business(String name, String afm, String location, String busOwner) {
		super(name, afm);
		
		this.busOwner=busOwner;
		this.location=location;
	}	
	
	//Getters
	public String getLocation() {
		return location;
	}

	public String getBusOwner() {
		return busOwner;
	}
	
	public void Print() {
		System.out.println("Business info.");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Name: "+getName() +"\nAfm: "+getAfm() +"\nBusiness Owner: "+getBusOwner() 
			+"\nBusiness location: " +getLocation();
	}
	
}
