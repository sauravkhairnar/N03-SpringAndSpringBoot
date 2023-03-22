package org.tnsif.autowiredexample;

public class Car {

	//DI in the Form Of Objects
	
	Desel d;


	//DI using Setters
	
	/*public void setD(Desel d) {
		this.d = d;
	}*/
	
	
	//Injecting the Object of Desel
	public void accept()
	{
		d.Engine();
	}


	public Car(Desel d) {
		super();
		this.d=d;
		System.out.println("Autowire Using Constructor");
		
	}
}
