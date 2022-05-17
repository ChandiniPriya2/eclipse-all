package ai.jobiak.exceptions;

public class CheckEligibility {

	public static void main(String[] args) {
		try {
		ExceptionDemo e=new ExceptionDemo(19);
		e.checkAge();
		}
		catch(ArithmeticException e1) {
			System.err.println(e1);
		}
		finally {
			System.out.println("end of the program");
		}
	//	ExceptionDemo e2=new ExceptionDemo(19);
		//System.out.println(e2.getAge());
	}

}
