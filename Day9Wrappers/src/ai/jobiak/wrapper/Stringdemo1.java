package ai.jobiak.wrapper;

public class Stringdemo1 {

	public static void main(String[] args) {
		String s="Hello";
		s=s.concat("world");
		//System.out.println(s);
		char[] str=s.toCharArray();
		for(int i=0;i<str.length;i++) {
		//	System.out.println(str[i]);
				}
		String str1="this is too long string";
		System.out.println(str1.hashCode());
		String  str2=  str1.intern();        //"this is too long string";
		System.out.println(str2.hashCode());
	    boolean res=str1==str2;  //compares memory locations, true
		System.out.println(res);
		System.out.println(str1.equals(str2)); //compares content of two objects,true
		
		String s1=new String("Hi");
		String s2=  new String("Hi");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2); //false
		System.out.println(s1.hashCode());//same
		System.out.println(s2.hashCode());
		System.out.println(s2.replace('H','i'));
		String s3="chandini @gmail .com";
		System.out.println(s3);
	//	System.out.println(s3.replaceAll(' ',"%20"));
	String[] words=s3.split("\\s");
	for(String w:words) {
		System.out.println(w);
	}
	if(s3.endsWith(".com"))
	System.out.println("valid email format");
	}

}
