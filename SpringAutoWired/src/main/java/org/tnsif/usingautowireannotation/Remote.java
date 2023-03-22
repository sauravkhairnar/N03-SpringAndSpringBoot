package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	

	
	
	private Cell cell;
	
	
	@Autowired
	@Qualifier("c2")
	public void setCell(Cell cell)
	{
		this.cell=cell;
	}

	//Default Constructor
	public Remote() {
	
		System.out.println("Default Constructor for Remote");
	}
	
	//Injecting the Object of Cell Class
	public void remote()
	{
		cell.power();
	}
	

}
