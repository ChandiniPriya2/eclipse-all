package ai.jobiak.usingalloops;

import java.util.Scanner;

public class AlphMango {
	public void feedback() { 
		System.out.println("please give your feedback in the form of rating");
		Scanner sc=new Scanner(System.in);
		int rating=sc.nextInt(); 
		System.out.println(rating + "Stars");
		System.out.println("Thanks for your feedback.. ");
		}
}
