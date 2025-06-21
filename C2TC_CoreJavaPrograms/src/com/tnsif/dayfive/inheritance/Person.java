package com.tnsif.dayfive.inheritance;

public class Person {
        private int id;
        private String name;
        private String city;
        
		/**
		 * @param id
		 * @param name
		 * @param city
		 */
         public Person() {
			
			this.id = id;
			this.name = name;
			this.city = city;
		}
        public Person (int id, String name, String city) {
        	this.id = 101;
			this.name = "grace";
			this.city = "Chennai";
        }
		
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", city=" + city + ", getId()=" + getId() + ", getName()="
					+ getName() + ", getCity()=" + getCity() + "]";
		}
        
}
