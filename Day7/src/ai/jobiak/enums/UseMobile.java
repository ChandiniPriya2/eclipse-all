package ai.jobiak.enums;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m=Mobile.valueOf("Google");
		System.out.println(m);
		System.out.println(m.showPrice());
		for(Mobile mob:Mobile .values()) {
			System.out.println("Brand= " + mob + "price= " + mob.showPrice()+ "index= " + mob.ordinal() );
			
		}

	}

}
