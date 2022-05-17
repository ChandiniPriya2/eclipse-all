package ai.jobiak.shopping;

import java.io.Serializable;

public class Product implements Serializable {
private String productId;
private String description;
private double price;
public Product(String productId, String description, double string) {
	super();
	this.productId = productId;
	this.description = description;
	this.price = string;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Product [productId=" + productId + ", description=" + description + ", price=" + price + "]";
}

}
