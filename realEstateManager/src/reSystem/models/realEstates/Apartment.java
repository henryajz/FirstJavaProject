package reSystem.models.realEstates;

import java.util.Calendar;
import java.util.Date;

public class Apartment extends Building {
	private int floor;
	private int numOfRooms;
	
	//Constructor
	public Apartment(int use ,String code, String country, String city, double area, double pricePerm2, double totalCost,
			String address, Date buildYear, int floor, int numOfRooms) {
		
		super(code, country, city, area, pricePerm2, totalCost, address, buildYear, use);
		
		this.floor=floor;
		this.numOfRooms=numOfRooms;
	}

	//Getters
	public int getFloor() {
		return floor;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}
	
	//Setters
	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	
	public double getTotaltax() {
		int years;
		double tax=0;
		
		Calendar crDate = Calendar.getInstance();
		Calendar now = Calendar.getInstance();
		
		
		crDate.setTime(getBuildYear());
		
		System.out.println(crDate);
		System.out.println(now);
		
		System.out.println(now.getWeekYear());
		System.out.println(crDate.getWeekYear());
		
		years = (now.getWeekYear() - crDate.getWeekYear()) ;
		System.out.println(years);
		
		if( years<10) {	
			tax+=  (getPricePerm2() * getArea()) * (1 + (getFloor()*0.05));

			return tax;
		}
		if(years>9 && years<20) {
			tax+=  ((getPricePerm2() * getArea()) * 0.9) * (1 + (getFloor()*0.05));
			

			return tax;
		}
		if(years>19 && years<30) {										
			tax+=  ((getPricePerm2() * getArea()) * 0.8) * (1 + (getFloor()*0.05));

			return tax;
		}
		else {
			tax+=  ((getPricePerm2() * getArea()) * 0.5) * (1 + (getFloor()*0.05));

			return tax;
		}

	}
	
	public void Print() {
		System.out.println("\n"+"Apartment info.");
		if(getChoice()==1) {
			System.out.println("Building for personal use.");
		}
		else 
			System.out.println("Workplace building.");
		
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "\n"+"Code: "+getCode() + "\n"+"Prefecture: " + getCountry() + "\n"+"\r\n" + 
				"Municipality: "+getCity() 
		+"\n"+ "Area: " + getArea()	+"\n"+"Price per square metre: " + getPricePerm2() 
		+  "\n"+"Floor: " +getFloor() + "\n"+"Number of rooms: " + getNumOfRooms()
		+"\n"+"Build year: "+getBuildYear()+"\n"+"Total cost of aprtment: "+getTotalCost() ;
	}
}
