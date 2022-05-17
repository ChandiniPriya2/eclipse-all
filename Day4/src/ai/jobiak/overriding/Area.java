package ai.jobiak.overriding;

public class Area {

	public static void main(String[] args) {
		
	Shape s=new Rectangle(9,10);
	System.out.println(s.area() );//early binding
	s=new Triangle(22,16);
	System.out.println(s.area() );
   

	}

}
