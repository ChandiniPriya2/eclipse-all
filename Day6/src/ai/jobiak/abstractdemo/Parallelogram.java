package ai.jobiak.abstractdemo;

public class Parallelogram extends Shape {
double b=34;
double h=9;
	@Override
	public void  area() {
	
	System.out.println("Area of parallelogram: " +b*h);


	}

	@Override
	public void  perimeter() {
		
		System.out.print("Perimeter of Parallelogram:" + 2*(b+h));
		

	}

}
