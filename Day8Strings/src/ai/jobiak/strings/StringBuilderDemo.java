package ai.jobiak.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("jobiak.ai");
		StringBuilder str1=new StringBuilder("jobiak.ai");
		
		System.out.println(str);
		System.out.println(str.capacity());  //25 initial capacity
		System.out.println(str.charAt(0));
		System.out.println(str.equals(str1)); //false
		System.out.println(str.hashCode());//different
		System.out.println(str1.hashCode());
	    System.out.println(str1==str); //false
	    

	}

}
