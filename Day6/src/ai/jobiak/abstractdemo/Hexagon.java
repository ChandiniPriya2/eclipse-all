package ai.jobiak.abstractdemo;

public class Hexagon extends Shape {
double a=56.0;
	@Override
	public void area() {
	
	System.out.print("Area of hexagon : " + (3*Math.sqrt(a)*(a*a))/2);

	}

	@Override
	public void  perimeter() {

System.out.print("Perimeter of hexagon : "+  6*a);

	}

}
