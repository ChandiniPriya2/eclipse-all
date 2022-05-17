package ai.jobiak.usingalloops;
import java.util.Scanner;
public class MyProfile implements  StoreAndOrder {
int temp=0;
Scanner sc= new Scanner(System.in);
 public void addTocart() {
	System.out.println("are you want to add this item to your cart");
	System.out.println("true or false");
	boolean opinion=sc.nextBoolean();
	if(opinion==true) {
			if(temp<=15) {
			temp=temp+1;
			System.out.println("item is added to  your cart successfully!!!");
			System.out.println("your cart has " + temp +" items");
		  }
	}
			else {
			System.out.println("Ok");
				 System.out.println("Choose another one...");
		    }
	}
 public void buyNow() {
			System.out.println("Enter your name:");
			Scanner sc=new Scanner(System.in);
			String  name=sc.nextLine();
			System.out.println("Enter your Address Details");
			System.out.println("Enter the  pincode");
			int  pin=sc.nextInt();
			System.out.println("Enter City name:");
			String cn=sc.nextLine();
			System.out.println("Enter the district:");
			String d=sc.nextLine();
			System.out.println("enter the landmark:" );
			String lm=sc.nextLine();
		}
 public void  payment() {
	System.out.println("choose the payment method");
	System.out.println("1.UPI");
	System.out.println("2..NET BANKING");
	System.out.println("3.DEBIT/CREDIT CARD");
	System.out.println("4.CASH ON DELIVERY");
	int a=sc.nextInt();
	switch(a) {
	case 1:
		System.out.println("enter upi Id");
		final long num=sc.nextLong();
		break;
	case 2:
		System.out.println("Enter Account number:");
		final long ac=sc.nextLong();
		System.out.println("Enter IFSC code:");
		final String ic=sc.nextLine();
		System.out.println("Enter Account Holder's name: ");
		final String na=sc.nextLine();
	break;
	case 3:
		System.out.println("Enter card number:");
		final long ca=sc.nextLong();
		System.out.println("Enter cvv :");
		final int cv=sc.nextInt();
		break;
	case 4:
	System.out.println("payment through offline");
		break;
		default:
			System.out.println("choose the above method");
	}
	System.out.println("your order is placed successfully!!!");
 }
}





	