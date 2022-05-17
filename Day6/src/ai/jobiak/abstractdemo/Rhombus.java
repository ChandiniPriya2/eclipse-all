package ai.jobiak.abstractdemo;

public class Rhombus extends Shape {
double diag1=8,diag2=78,side=7;
	@Override
	public void  area() {
	
	System.out.println("Area of rhombous : "+(diag1*diag2)/2 );

	}

	@Override
	public void  perimeter() {
		
	
	System.out.println("Perimetr of rhombous : "+ 4*side );
	
	
	}

}
