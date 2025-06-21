package com.tnsif.dayfive.inheritance;

public class Trainer extends Person {
       private String designation;
       private String location;
       
       
	/**
	 * @param designation
	 * @param location
	 */
	public Trainer() {
		super();
		this.designation = "Trainer";
		this.location = "Chennai";
	}
	
	/**
	 * @param designation
	 * @param location
	 */
	public Trainer(int id, String name, String city,String designation, String location) {
		super(id,name,city);//calling base class parameterized constructor
		this.designation = designation;
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + getId() + ", name=" + getName() + ", city=" + getCity() +", designation=" + designation + ", location=" + location + "]";
	}
       
       
       }
