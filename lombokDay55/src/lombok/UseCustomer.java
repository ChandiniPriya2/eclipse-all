package lombok;

public class UseCustomer {

	public static void main(String[] args) {
		
Customer cust=new Customer();
cust.setCustId(501);
cust.setName("John");
cust.setBalance(66000);
System.out.println(cust.getCustId());
System.out.println(cust.getName());
System.out.println(cust.getBalance());

System.out.println(cust);

Customer cust1=new Customer(502,"John Doas",3000);
System.out.println(cust1);
boolean result=cust.equals(cust1);
System.out.println(result);

Customer cust2=new Customer(502,"John Doas",3000);
System.out.println(cust2);
boolean result2=cust1.equals(cust2);
System.out.println(result2);

Product p=Product.builder()
.productId(501)
.desc("coke")
.price(29)
.build();
System.out.println(p);



	}

}
