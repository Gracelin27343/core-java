package polymorphism.overloading;

public class Executor {

	public static void main(String[] args) {
		System.out.println("1.Addition:"+OverloadingExample.addition("hello","world"));
		System.out.println("2.Addition:"+OverloadingExample.addition(27,30));
		System.out.println("3.Addition:"+OverloadingExample.addition(23,30.9f));
		System.out.println("4.Addition:"+OverloadingExample.addition(45.8f,39));
		System.out.println("5.Addition:"+OverloadingExample.addition(45f,67f));

		
		Person p = new Person(); //1 parameter
		System.out.println(p);
		
		p=new Person("grace",101);
		System.out.println(p);
		
		p=new Person("geo",101,"Delhi");
		System.out.println(p);
	}

}
