package day2;

public class TypeCasting {

	public static void main(String[] args) {
// widening / implicit type casting
		
		byte b = 27;
		int i = b;
		System.out.println(i);
		
		float f = 30.27f;
		double d = f;
		System.out.println(d);
		
		char ch = 'J';
		int i3 = ch;
		System.out.println(i3);
		
		char var1 = '\u00AC';
		int i4 = var1;
		System.out.println(i4);
		
		// narrowing/explicit type casting

		double f1 = 27.03f;
		long l = (long) f1;
		System.out.println(l);

		long l1 = 923372036854775806l;
		int i2 = (int) l1;
		System.out.println(i2);

		float f2 = 30.56f;
		int i1 = (int) f2;
		System.out.println(i1);

		byte b1 = 60;
		char ch1 = (char) b1;
		System.out.println(ch1);

	}

}
