package day3;

public class ForLoop {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};	
//for integer array
		for(int i:a)
		{
		System.out.println(i);	
		}
		
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.print(c);		
		}
		System.out.println(" ");
		String s1[]= {"Java","programming","learning"};
//for String array
		for(String s:s1)
		{
			System.out.print(s+" ");		
		}
		//example of for
		for(int i = 0; i<=100; i++)   //(int i = 1000; i<=1;i--)
		{	
			System.out.print("Value of i:");
			System.out.println(i);
		}
		
		
		for(int i = 0; i<=10; i++)
		{	
			System.out.print("Value of i:" +i+" ");
			
		}
	}

}
