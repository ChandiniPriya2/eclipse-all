package ai.jobiak.abstractdemo;

public class Cone extends Shape {
	double r=14,h=12;

	@Override
	public void area() {
	
	System.out.println("Surface area :" + Math.PI*r*(r+Math.sqrt((h*h)+(r*r))));
	
	
	}

	@Override
	public void  volume() {
		
		System.out.println("Volume of cone : "+ Math.PI*(r*r)*(h/3));
	
	}

}
