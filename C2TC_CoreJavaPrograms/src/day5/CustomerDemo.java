package day5;

import java.util.Scanner;

import day4.Customer;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		
		System.out.println(" ");

		Customer c1=new Customer(); 
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		System.out.println(c1);

		
		Customer c2=new Customer(name, id, city); 
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		System.out.println(c2);
		sc.close();
		Customer c3=new Customer(name, id, city); //parameterized constructor invoked);
		
        System.out.println(c3);
		
		sc.close();
		


	}

}
