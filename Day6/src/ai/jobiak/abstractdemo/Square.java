package ai.jobiak.abstractdemo;

public class Square extends Shape {
 
 double side=56.9;
 
	/*public Square(double side) {
	
	this.side = side;
}*/

	@Override
	public void area() {
	
	System.out.println( side*side) ;
	
	}

	@Override
	public void perimeter() {
	
		System.out.println("Perimeter of square is: "+ 4*side  );


		
	}

}
