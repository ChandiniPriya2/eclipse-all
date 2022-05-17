package ai.jobiak.abstractdemo;

public class Trapezium extends Shape {
	double a=6.9,b=9.7,c=7.6,d=8.8,h=56.9;

	@Override
	public void area() {
		
		System.out.println("Area of trapezium : "+((a+b)/2)*h );
		

	}

	@Override
	public void perimeter() {
	
		System.out.println("Perimeter of trapezium : "+ a+b+c+d);
	
		}

}
