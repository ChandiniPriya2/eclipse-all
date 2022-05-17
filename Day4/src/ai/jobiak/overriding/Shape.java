package ai.jobiak.overriding;

public class Shape {
	double x;
	double y;

public Shape(double x, double y) {
	
		this.x = x;
		this.y = y;
	}

double area()
{
	System.out.println("Area is not defined");
	return 0.0;
}
}
