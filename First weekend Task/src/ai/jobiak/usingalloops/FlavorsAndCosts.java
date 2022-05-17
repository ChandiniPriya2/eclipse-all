package ai.jobiak.usingalloops;

public class FlavorsAndCosts {
private String flavor;
private double  priceOfRegular;
private double priceOfFamilyPack;

public FlavorsAndCosts(String flavor, double priceOfRegular, double priceOfFamilyPack) {
	super();
	this.flavor = flavor;
	this.priceOfRegular = priceOfRegular;
	this.priceOfFamilyPack = priceOfFamilyPack;
}
public String getFlavor() {
	return flavor;
}
public void setFlavor(String flavor) {
	this.flavor = flavor;
}
public double getPriceOfRegular() {
	return priceOfRegular;
}
public void setPriceOfRegular(double priceOfRegular) {
	this.priceOfRegular = priceOfRegular;
}
public double getPriceOfFamilyPack() {
	return priceOfFamilyPack;
}
public void setPriceOfFamilyPack(double priceOfFamilyPack) {
	this.priceOfFamilyPack = priceOfFamilyPack;
}
@Override
public String toString() {
	return "FlavorsAndCosts [flavor=" + flavor + ", priceOfRegular=" + priceOfRegular + ", priceOfFamilyPack="
			+ priceOfFamilyPack + "]";
}

}
