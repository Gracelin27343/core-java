//singleton class
package com.tnsif.dayfour.secondpacakge;

public class MyClass {
	  // Step 1: Create a private static instance
	private static MyClass obj=new MyClass();
	//variable
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	// Step 2: Make constructor private
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	 // Step 3: Create a public static method to get the instance
	public static MyClass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}
