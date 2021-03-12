package reSystem.models.realEstates;

public abstract class RealEstate {
	private String code;
	private String prefecture;
	private String municipality;
	private double area;
	private double pricePerm2;
	private double totalCost;

	//Constructors
	public RealEstate(String code, String prefecture, String municipalty, double area, 
			double pricePerm2, double totalCost) {
		this.code=code;
		this.prefecture=prefecture;
		this.municipality=municipalty;
		this.area=area;
		this.pricePerm2=pricePerm2;
		this.totalCost=totalCost;
	}
	
	//Getters
	public String getCode() {
		return code;
	}

	public String getCountry() {
		return prefecture;
	}

	public String getCity() {
		return municipality;
	}

	public double getArea() {
		return area;
	}

	public double getPricePerm2() {
		return pricePerm2;
	}

	public double getTotalCost() {
		return totalCost;
	}
	
	public abstract double getTotaltax();


	public abstract void Print();
	
	public abstract String toString();
}
