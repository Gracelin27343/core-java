package exceptionhandling;

public class ExceptioonExample {

	public static void main(String[] args) {
		try {
			int a[]= {6,7,8,9};//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4

        System.out.println(a[5]);
        
	}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.err.println("Exception occured:"+ae.getMessage());
		}
		{
			System.out.println("next line");
		}
	}
}
