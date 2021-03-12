package reSystem.models.realEstates;

import java.util.Calendar;
import java.util.Date;

public class DetachedHouse extends Building {
	private int maxFloors;
	private double poolArea;

	//Constructor
	public DetachedHouse(int use ,int maxFloors,double poolArea ,String code, String prefecture, String municipalty, 
			double area, double pricePerm2, double totalCost, String address, Date buildYear) {
		
		super(code, prefecture, municipalty, area, pricePerm2, totalCost, address, buildYear, use);

		this.maxFloors=maxFloors;
		this.poolArea=poolArea;
	}

	//Getters
	public int getMaxFloors() {
		return maxFloors;
	}

	public double getPoolArea() {
		return poolArea;
	}
	
	//Setters
	public void setMaxFloors(int maxFloors) {
		this.maxFloors = maxFloors;
	}

	public void setPoolArea(float poolArea) {
		this.poolArea = poolArea;
	}
	
	//Calculates taxes
	public double getTotaltax() {
		int years;
		double tax=0;
		
		Calendar crDate = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		
		crDate.setTime(getBuildYear());
		
		years = (now.getWeekYear() - crDate.getWeekYear()) ;
		
		if( years<10) {	
			tax+=  ((getPricePerm2() * getArea())) + getPoolArea()*10;
			return tax;
		}
		if(years>9 && years<20) {
			tax+=  ((getPricePerm2() * getArea()) * 0.9) + getPoolArea()*10;
			return tax;
		}
		if(years>19 && years<30) {										
			tax+=  ((getPricePerm2() * getArea() )* 0.8) + getPoolArea()*10;
			return tax;
		}
		else {
			tax+=  ((getPricePerm2() * getArea()) * 0.5) + getPoolArea()*10;
			return tax;
		}
	}
	
	public void Print() {
		System.out.println("\n"+"Detached house info.");
		if(getChoice()==1) {
			System.out.println("Building for personal use.");
		}
		else 
			System.out.println("Workplace building.");
		
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "\n"+"Code: "+getCode() +"\n"+ "Prefecture: " + getCountry() +"\n"+ "\r\n" + "Municipality: " + getCity() +"\n"
				+"\n"+ "Address: "+getAddress() +"\n"+"Creation date: "+getBuildYear()+ "Area: " + getArea()
				+"\n"+"Price per square metre: " + getPricePerm2() +"\n"+"\n"+"Max floors: "+getMaxFloors()
				+"\n"+"Pool area: " +getPoolArea()+"\n"+"TotalCost: " +getTotalCost();
	}
	
}
