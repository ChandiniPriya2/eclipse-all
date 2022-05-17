package ai.jobiak.abstractdemo;

public class Sphere extends Shape {
double r=56.9;
	@Override
	public void  area() {
		
		System.out.println("Area of sphere : "+4*Math.PI*(r*r) );
		
	}

	@Override
	public void volume() {
	 
	  System.out.println("Volume of sphere : " + 4/3*(Math.PI)*(r*r*r));
	
	}

}
