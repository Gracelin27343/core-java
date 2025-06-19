package com.tnsif.dayfour.secondpacakge;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		// Can't create object with private constructor
				// MyClass m1=new MyClass();
				
				MyClass m=MyClass.getObject();
				m.setId(10);
				
				MyClass m1=MyClass.getObject();
				 // Check if both are same object
				System.out.println(m==m1);
				//System.out.println(m1);
				
			}

	}
