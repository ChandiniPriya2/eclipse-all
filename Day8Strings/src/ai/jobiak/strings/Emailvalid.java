package ai.jobiak.strings;

import java.util.Scanner;

public class Emailvalid {
String userid="chandini234@gmail.com";
String password="strongpassword@341";
public void valid() {
	
	System.out.println("enter user name");
	Scanner sc=new Scanner(System.in);
	String userid1=sc.nextLine();
	
		if(userid1.matches(userid)){
		System.out.println("enter your password");
	String password1=sc.nextLine();
	if(password.matches(password1)) {
		System.out.println("User is valid..");
		}
	else
		System.out.println("please enter valid password");
	}
	else
		System.out.println("Please enter valid user name");
}

}

