package ai.jobiak.enums;

public class UseApple  {
	public static void main (String args[]) {
		Apple apple= Apple.Kashmir;//enum type is required to access kashmir 
		System.out.println(apple);
		for(Apple element:Apple .values()) {
			System.out.println(element+"     "+element.ordinal());
			
		}
	}
}
