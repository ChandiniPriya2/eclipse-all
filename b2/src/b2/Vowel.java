package b2;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		System.out.println("Enter a character");
		 Scanner sc=new Scanner(System.in);
		char ch= sc.next().charAt(0);
		switch(ch)
		{
		 case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Given character is an vowel");
		break;
		case 'b':
		case 'c':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		System.out.println("Given character is a consonant");
		break;
		default:
		System.out.println("please enter valid character");
		}
		}
	}


