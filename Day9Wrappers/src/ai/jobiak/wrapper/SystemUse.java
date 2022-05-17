package ai.jobiak.wrapper;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class SystemUse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Properties props=System.getProperties();
		Enumeration enumerator=props.elements();
		while(enumerator.hasMoreElements()) {
			System.out.println(enumerator.nextElement());
		}
	}

}
