package day5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   
	   System.out.println("enter your name");
	   String name = reader.readLine();
	   
	   System.out.println("Enter age");
		int age = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter salary");
		double salary = Double.parseDouble(reader.readLine());
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("salary:"+salary);
	}

}
