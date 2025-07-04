package polymorphism.overriding;

public class Square extends Shape{

	public Square(float Area) {
		super.area=area;
	}
	@Override
	public void calArea() {
		System.out.println("from shape:"+super.area*super.area);
	}
}
