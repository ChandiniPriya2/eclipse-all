package ai.jobiak.modified;

public class StickIce extends IceCream {
String flavour;
double price;
public StickIce(String flavour, double price) {
	super();
	this.flavour = flavour;
	this.price = price;
}
public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
@Override
public String toString() {
	return "StickIce [flavour=" + flavour + ", price=" + price + "]";
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
