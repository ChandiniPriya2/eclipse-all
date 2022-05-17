package ai.jobiak.usingalloops;

import java.util.Scanner;

public class MixedFruit {
	public void feedback() { 
		System.out.println("please give your feedback in the form of rating");
		Scanner sc=new Scanner(System.in);
		int rating=sc.nextInt(); 
		System.out.println(rating + "stars");
		System.out.println("Thanks for your feedback.. ");
		}
}
