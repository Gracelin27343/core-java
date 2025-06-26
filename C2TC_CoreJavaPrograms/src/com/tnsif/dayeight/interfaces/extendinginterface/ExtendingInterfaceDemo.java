package com.tnsif.dayeight.interfaces.extendinginterface;

public class ExtendingInterfaceDemo implements ChildInterface,InterfaceOne {

		// Override ChildInterface method
	@Override
		public void print() { 
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}

}