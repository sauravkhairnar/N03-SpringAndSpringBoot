package org.tnsif.objectsInjection;

public class Charger {
	
	//Data Members
	private String brand;
	private int voltage;
	private String Type;
	
	//DI Using Setter 
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public void setType(String type) {
		Type = type;
	}
	
	public void power()
	{
		System.out.println("Charger Details: ");
		System.out.println("Brand" +brand +" " + "Volatage" +voltage +" " + "Charger-Type:" +Type);
	}
	
	
}
