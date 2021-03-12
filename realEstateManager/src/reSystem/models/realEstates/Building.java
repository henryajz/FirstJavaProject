package reSystem.models.realEstates;

import java.util.Date;

public abstract class Building extends RealEstate{
	private String address;
	private Date buildYear;
	private int choice;
	
	//Constructors	
	public Building(String code, String prefecture, String municipalty, double area, double pricePerm2,
			double totalCost, String address, Date buildYear, int choice) {
		
		super(code, prefecture, municipalty, area, pricePerm2, totalCost);
		
		this.address=address;
		this.buildYear=buildYear;
		this.choice=choice;
	}

	//Getters
	public String getAddress() {
		return address;
	}

	public Date getBuildYear() {
		return buildYear;
	}
	

	public int getChoice() {
		return choice;
	}

	
	public abstract void Print();
	public abstract String toString();
	public abstract double getTotaltax();
}
