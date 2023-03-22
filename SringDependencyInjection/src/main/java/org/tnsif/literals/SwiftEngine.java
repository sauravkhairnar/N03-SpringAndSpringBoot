package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	//1. Dependency Injection in the Form Of Literals
	private String company;
	private double cost;
	
	public double cost() {
		return cost;
	}
	public String dsiplay() {
		// TODO Auto-generated method stub
		return "Japan";
	}
	
	//DI using Constructor
	
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Origin Of Company: "+company +"Fuel Type: " +Fuel;
	}
	
	

	
}
