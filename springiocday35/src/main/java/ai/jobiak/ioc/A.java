package ai.jobiak.ioc;

public class A {
B b;
public A() {
	System.out.println("A is created");
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}
void print() {
	System.out.println("Hello b");
}
void display() {
	
	print();
	b.print();
}


}
