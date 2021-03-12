package reSystem.models.owners;

public abstract class Owner {
	private String afm;
	private String name;
	
	//Constructors
	public Owner(String name, String afm) {
		this.afm=afm;
		this.name=name;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public String getAfm() {
		return afm;
	}
	
	public abstract void Print();
	public abstract String toString();
}
