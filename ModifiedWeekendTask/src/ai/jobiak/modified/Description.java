package ai.jobiak.modified;

public class Description implements StoreManagement {
	private double price;
	private int qty;
	private double stock;

	public Description(double price, int qty, double stock) {
	
		this.price = price;
		this.qty = qty;
		this.stock = stock;
	}
	

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getStock() {
		return stock;
	}


	public void setStock(double stock) {
		this.stock = stock;
	}


	@Override
	public void addIcecreamQty(int amount) {
		this.qty+=amount;
		System.out.println("After adding quantity is" + this.qty);
		
		}

	@Override
	public void modifyQuantity(int amount) {
		this.qty-=amount;
		
}

	@Override
	public void modifyPrice(double rate) {
		System.out.println("price:" + rate);
		}

	@Override
	public void showStock() {
		
}

}
