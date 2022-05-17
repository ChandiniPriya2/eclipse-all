package ai.jobiak.abstractdemo;

public class Rectangle extends Shape {
	
	double l=9,b=8.9;
	public void  area() {
		
		System.out.println("Area of rectangle: "+ l*b  );
		
		}
	public  void  perimeter() {
	
		System.out.println("perimeter of rectangle is: "+2*(l+b) );
	
		}

}
