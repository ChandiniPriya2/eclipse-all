package ai.jobiak.abstractdemo;

public class Circle extends Shape {
double r;

	public Circle(double r) {

	this.r = r;
}


	@Override
	public void area() {
 
	System.out.println("Area of circle is "+   2*Math.PI*(r*r));
	
	
	}

	
	public void perimeter() {

	System.out.println("Circumference of circle : "+  2*Math.PI*r );

	}

}
