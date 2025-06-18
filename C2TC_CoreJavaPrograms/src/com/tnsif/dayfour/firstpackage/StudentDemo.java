package com.tnsif.dayfour.firstpackage;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = Student.getS1();
		
		st.setId(101);
		st.setName("Grace");
		
		Student st1 = Student.getS1();
		System.out.println(st1);
		System.out.println(st);
	}

}
