package reSystem.models.realEstates;

public class LandPlot extends Plot {
	private final double buildArea=0;
	
	public LandPlot(String code, String prefecture, String municipalty, double area, 
			double pricePerm2, double totalCost, double buildArea) {
		super(code, prefecture, municipalty, area, pricePerm2, totalCost);
	}

	//Getters
	public double getBuildArea() {
		return buildArea;
	}
	
	
	public double getTotaltax() {
			return getArea() * getPricePerm2();
	}
	
	public void Print() {

		System.out.print("\n"+"Land Plot info.");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "\n"+"Code: "+getCode() + "\n"+"Prefecture: " + getCountry() +"\n"+ "\r\n" + 
				"Municipality: " + getCity() +"\n"+ "Area: " + getArea()
		+"\n"+"Price per square metre: " + getPricePerm2() +"\n"+"Building area: "+getBuildArea() +"\n"+ "Total cost: " +getTotalCost();
	}
}
