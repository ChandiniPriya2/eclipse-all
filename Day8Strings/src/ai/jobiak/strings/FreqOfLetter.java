package ai.jobiak.strings;

import java.util.Scanner;

public class FreqOfLetter {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("enter the letter you want to find");
		char character=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(character==str.charAt(i)) {
				count++;
			}
		}
		System.out.println("Frequency of the given character is"+count);
		

}
}