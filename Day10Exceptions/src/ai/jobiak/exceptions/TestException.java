package ai.jobiak.exceptions;

public class TestException {

	public static void main(String[] args) {
		try {
	String str=new String("hello");
	Object obj=str;
	Integer integer=(Integer) obj;
	int a=Integer.parseInt("ten");
	int b=0;
	int c=a/b;
	System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End");
		}

	}

}
