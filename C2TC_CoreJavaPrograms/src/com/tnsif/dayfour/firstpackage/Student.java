package com.tnsif.dayfour.firstpackage;

public class Student {
	
		private static Student s1= new Student();
			private String name;
			private int id;
			public static Student getS1() {
				return s1;
			}
		
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
	
			public Student(String name, int id) {
				super();
				this.name = name;
				this.id = id;
			}
			public Student() {
				// TODO Auto-generated constructor stub
			}

			@Override
			public String toString() {
				return "Student [name=" + name + ", id=" + id + ", getName()=" + getName() + ", getId()=" + getId()
						+ "]";
			}
	           
	
}
