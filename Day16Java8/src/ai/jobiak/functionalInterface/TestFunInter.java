package ai.jobiak.functionalInterface;
@FunctionalInterface
interface Demo{
	void test(int a,int b);
}
 class Inter implements Demo{

	@Override
	public void test(int a, int b) {
		
		System.out.println("a is"+ a+ "b is"+ b);
	}
	
}
public class TestFunInter{

	public static void main(String[] args) {
		//Method 1
		/*
		 * Inter c=new Inter(); c.test(10, 20);
		 */
		/*
		 * //Anonymous class Method2
		 *  Demo d=new Demo() {
		 *   public void test() {
		 * System.out.println("hello"); 
		 * }
		 *  };
		 *   d.test();
		 */
		
		//Lambda function //Method 3
		Demo d=(a,b)->{System.out.println("a value is "+a+" b value is"+b);};
		d.test(10,20);
	}
	
}