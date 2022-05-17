package ai.jobiak.enums;

public enum Mobile {
	Apple(3000),Google(2500),Blackberry(1200),Samsung(2000);
	int price;

	 Mobile(int price) {
		this.price = price;
	}
	 int showPrice() {
		 return this.price;
	 }
	
	

}
