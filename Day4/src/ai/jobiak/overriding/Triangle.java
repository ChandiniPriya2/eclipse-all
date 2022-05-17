package ai.jobiak.overriding;

public class Triangle extends Shape {
	public Triangle(double a,double b) {
		super(a,b);
	}
	double area()
	{
		System.out.println("Area of triangle is");
		return x*y/2;
	}

}
