package ai.jobiak.overriding;

public class Rectangle extends Shape {
	public Rectangle(double c,double d) {
		super(c,d);
	}
	double area()
	{
		System.out.println("Area of rectangle is");
		return x*y;
	}
}
