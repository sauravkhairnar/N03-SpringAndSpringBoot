package org.tnsif.autowiredexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		Car c1=c.getBean("car",Car.class);
		c1.accept();

		
	}

}
