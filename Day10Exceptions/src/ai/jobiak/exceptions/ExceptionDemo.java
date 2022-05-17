package ai.jobiak.exceptions;

public class ExceptionDemo {
	private int age;

	public ExceptionDemo(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void checkAge() throws ArithmeticException {
if(this.age<18) {
	throw new ArithmeticException("Access denied-you must be atleast 18 years");
}
else {
	System.out.println("ok");
}
	}
}
