package ai.jobiak.modified;

public class Cone extends IceCream {
String flavour;
double price;
public Cone(String flavour, double price) {
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Cone [flavour=" + flavour + ", price=" + price + "]";
}

}
