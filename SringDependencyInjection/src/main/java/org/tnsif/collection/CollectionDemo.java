package org.tnsif.collection;

import java.util.List;
import java.util.Set;
//program to demonstrate on DI in the Form of Collection
public class CollectionDemo {
	
	private List<String>contactNo;
	private Set<String>books;
	
	//DI using Setters
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display()
	{
		System.out.println("List of Contact Number: ");
		for(String contact: contactNo)
		{
			System.out.println(contact);
		}
		System.out.println( );
		System.out.println("Sets of Books : ");
		for(String book: books)
		{
			System.out.println(book);
		}
	}

}
