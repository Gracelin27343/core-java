package polymorphism.overriding;

public class Rectangle extends Shape{

	private double l,b;
	public Rectangle(double l, double b) {
		this.l=l;
		this.b=b;
	}
	
	@Override
	public void calArea() 
	{
		System.out.println("from shape:"+(l*b));
	}
}
