package ai.jobiak.advainherit;

public class Derived2 extends Base2 {
	
int data;
public Derived2() {
	System.out.println(super.data);
	System.out.println(this.data);
	
}
void m() {
	System.out.println(data+"from derived class");
	super.m();
}

}
