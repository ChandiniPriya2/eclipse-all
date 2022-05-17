package ai.jobiak.exceptions;

public class ThrowDemo {
	public static void main(String args[]) {
		try {
			throw new ArithmeticException("demo");
		}
		catch(ArithmeticException e){
			System.out.println("Exception caught");
			
		}
	}

}
