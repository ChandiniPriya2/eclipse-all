
public class Media {

	public static void main(String[] args) {
		Posts obj=new Posts();
		obj.status="I am busy";
		obj.setMsg("Hii");
		obj.no=12345678L;
		obj.setTrxn(1000);
		System.out.println("My status is " + obj.status);
		System.out.println("Message is "+ obj.getMsg());
		System.out.println("My whatsapp no is " + obj.no);
		System.out.println("I have transferred "+ obj.getTrxn());
		

	}

}
