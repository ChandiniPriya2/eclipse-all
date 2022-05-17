package ai.jobiak.overriding;

public class OverDemo2 extends OverDemo1 {
	public OverDemo2() {
	//	demo();
	}
	void a() {
		demo();
	}
	void demo() {
		System.out.println("sub class");
	}

}
