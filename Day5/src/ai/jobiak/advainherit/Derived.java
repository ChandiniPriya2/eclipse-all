package ai.jobiak.advainherit;

public class Derived extends Base {
	public Derived() {
		System.out.println(data);
	
	}
	//static method cannot be overriden;
	static void m() {
		System.out.println(data +" from Derived class");

}
}

