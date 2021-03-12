package reSystem.models.realEstates;

public abstract class Plot extends RealEstate {
	private double maxArea;

	//Constructor
	public Plot(String code, String prefecture, String municipalty, double area, 
			double pricePerm2, double totalCost) {
		
		super(code, prefecture, municipalty, area, pricePerm2, totalCost);
	}
	
	public double getMaxArea() {
		return maxArea;
	}

	public abstract double getTotaltax();
	public abstract void Print();
	public abstract String toString();
}
