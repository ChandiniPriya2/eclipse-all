package ai.jobiak.inheritance;

public class InheritDemo1 {
private	int a;
private	int b;
	public InheritDemo1() {
		System.out.println(a +  " From demo1");
	}
	public InheritDemo1(int a, int b) {
		this.setA(a);
		this.setB(b);
		System.out.println("int,int");
	}

	void demo() {
		System.out.println("parent class");
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}	
	



