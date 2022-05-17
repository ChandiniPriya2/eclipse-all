package ai.jobiak.optional;

import java.util.Arrays;
import java.util.List;

class Utility{
	public Utility() {
		System.out.println("from default constructor");
	}
	public void method() {
		System.out.println("from instance method");
	}
	public static void method2() {
		System.out.println("from static method");
	}
}
interface Utility2{
	void substitute();
}
public class TestMethodReferences {

	public static void main(String[] args) {
		
Utility util=new Utility();

Utility2 util2=util::method;//instance method reference
util2.substitute();

Utility2 util3=Utility::method2; //static method reference
util3.substitute();

Utility2 util4=Utility::new;//default constructor reference
util4.substitute();

List<Integer> list=Arrays.asList(1,2,3,4,5,6);
list.stream().forEach(System.out::println);
	}

}
