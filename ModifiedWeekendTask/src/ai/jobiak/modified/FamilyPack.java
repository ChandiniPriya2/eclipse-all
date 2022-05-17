package ai.jobiak.modified;

public class FamilyPack extends IceCream {
String flavour;
double price;
public FamilyPack(String flavour, double price) {
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
	return "FamilyPack [flavour=" + flavour + ", price=" + price + "]";
}

}
