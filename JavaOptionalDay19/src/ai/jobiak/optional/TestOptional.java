package ai.jobiak.optional;

import java.util.Optional;

public class TestOptional {
	static void method(String str) {
		if(str!=null) {
			System.out.println(str.length());
		}
	}

	public static void main(String[] args) {

		String str=null;
		String str1=new String("Hello");
		//System.out.println(str1);
		/*
		 * Optional opt2=Optional.of(str); System.out.println(opt2.get()); //Null pointer exception
		 */
		  Optional opt=Optional.of(str1);
		  System.out.println(opt.get());
		  
		  Optional opt1=Optional.ofNullable(str);
		  if(opt1.isPresent())
		  System.out.println(opt1.get()); // doesn't throw this  exception no such element  exception
		  
		  Optional opt2=Optional.ofNullable(str);
		  System.out.println(opt2.orElse("Alternate string"));
		  
		  
		  // creating a string array
	        String[] string = new String[5];
	 
	        // Setting value for 2nd index
	        string[2] = "Hello this is the optional class";
	 
	        // It returns an empty instance of Optional class
	        Optional<String> empty = Optional.empty();
	        System.out.println(empty);
	 
	        // It returns a non-empty Optional
	        Optional<String> value = Optional.of(string[2]);
	        System.out.println(value);
		 
	}

}
