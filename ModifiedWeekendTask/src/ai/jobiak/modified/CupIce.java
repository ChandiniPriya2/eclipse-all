package ai.jobiak.modified;

public class CupIce extends IceCream {
String flavour;
double price;
public CupIce(String flavour, double price) {
	
	this.flavour = flavour;
	this.price = price;
}
public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "CupIce [flavour=" + flavour + ", price=" + price + "]";
}

}
