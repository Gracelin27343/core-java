package Demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name = scanner.nextLine();
			
			System.out.println("Enter age");
			int age = scanner.nextInt();
			
			System.out.println("Enter salary");
			double salary = scanner.nextDouble();
			
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("salary:"+salary);
			
		}



	}

