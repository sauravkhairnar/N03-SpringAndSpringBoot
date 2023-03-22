package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Program to Demonstrate on Spring IOC

public class MobileExecutor {

	public static void main(String[] args) {
		
		//Hard Coding
	/*	Airtel a= new Airtel();
		a.call();
		a.message();
		
		Jio j=new Jio();
		j.call();
		j.message();
		*/
		
	ApplicationContext c= new ClassPathXmlApplicationContext("bean.xml");
	/*
	 * Airtel a=(Airtel) c.getBean("airtel");
	 
	a.call();
	a.message();
	
	Jio j=(Jio) c.getBean("jio");
	j.call();
	j.message();
	}
	*/
	
	Sim s=c.getBean("sim",Sim.class);
	s.call();
	s.message();
	
	Sim s1=c.getBean("sim1",Sim.class);
	s1.call();
	s1.message();
	
	}

}
