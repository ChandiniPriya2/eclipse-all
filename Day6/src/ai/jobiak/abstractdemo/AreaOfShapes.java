package ai.jobiak.abstractdemo;

public class AreaOfShapes {

	public static void main(String[] args) {
		Shape sref;
		sref=new Rectangle();
		sref.area();
		sref.perimeter();
		sref=new Circle(45.9);
		sref.area();
		sref.perimeter();
		sref=new Cone();
		sref.area();
		sref.volume();
		sref=new Hexagon();
		sref.area();
		sref.perimeter();
		sref=new Parallelogram();
		sref.area();
		sref.perimeter();
		sref=new Rhombus();
		sref.area();
		sref.perimeter();
		sref= new Sphere();
		sref.area();
		sref.volume();
		sref=new Square();
		sref.area();
		sref.perimeter();
		sref=new Trapezium();
		sref.area();
		sref.perimeter();
		sref=new Triangle();
		sref.area();
		sref.perimeter();
		
	}

}
