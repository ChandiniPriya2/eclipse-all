package ai.jobiak.abstractdemo;

public class Triangle extends Shape {
double  a=76.9,b=9.9,h=9;
	@Override
	public void area() {
System.out.println("Area of triangle:"+0.5*b*h);
	
	}

	@Override
	public void perimeter() {
	
	System.out.println("Perimeter of triangle: " + a+b+h);
	
	}

}
