package ai.jobiak.strings;
//import java.lang.*;
public class Palindrome {
String str;

public Palindrome(String str) {
	
	this.str = str;
}

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}

@Override
public String toString() {
	return "palindrome [str=" + str + "]";
}
public void check() {
	String rev="";
			for(int i=str.length()-1;i>=0;i--) {
				rev=rev+str.charAt(i);
				}
			if(str.equals(rev))
			System.out.println("Given string is a palindrome");
			else
			System.out.println("Given string is not a palindrome");
}


}
