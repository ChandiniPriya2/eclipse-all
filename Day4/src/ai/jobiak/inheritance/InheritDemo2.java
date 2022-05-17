package ai.jobiak.inheritance;

public class InheritDemo2 extends InheritDemo1 {
	public InheritDemo2() {
		int x=20;
		System.out.println(x);
		demo();
	}
	public InheritDemo2(int a,int b) {
//	super(a,b);
		System.out.println("parameterized con in derived");
	}
		void meth() {
		System.out.println("Child class " + getA());
		demo();
	}
}
