package ai.jobiak.wrapper;

public class StringMethods {

	public static void main(String[] args) {
		String str="hello Java";
		int result=str.codePointAt(7);    //returns the ASCII value 
		System.out.println(result);
	
       String str1="Hello java";
       int res=str.compareTo(str1);   //case sensitive
       System.out.println(res);
       
       String str4="";
       System.out.println(str4.isEmpty());
       
       int res2=str.compareToIgnoreCase(str1);
       System.out.println(res2);
       
       StringContains c=new StringContains("chandinigmail.com");
     c.demo();
       Stringdemo2 s=new Stringdemo2("Chandinipriya@gmail.com");
       s.check();
  
       }

}
