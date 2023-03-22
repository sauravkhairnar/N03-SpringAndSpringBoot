package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cell {
	private String Company;
	private String Size;
	
	//Getter And Setter
	@Autowired
	@Qualifier("cell")
	
	
	
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getSize() {
		return Size;
	}
	public void setSize(String size) {
		Size = size;
		
		//Default Constructor
		
	}
	public Cell() {
		super();
		System.out.println("default Constructor for Cell");
	}
	public void power()
	{
		System.out.println("Company of the cell :" +Company );
		System.out.println("Size of the cell :" +Size );
		

	}
	

}
