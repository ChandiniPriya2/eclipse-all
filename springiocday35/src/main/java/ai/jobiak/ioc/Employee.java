package ai.jobiak.ioc;



public class Employee {
	
String name;
int id;
int salary;
private Address address1;
private Address address2;
public Employee() {
	// TODO Auto-generated constructor stub
}


public Employee(String name, int id, int salary, Address address1,Address address2) {
	super();
	this.name = name;
	this.id = id;
	this.salary = salary;
	this.address1=address1;
	this.address2=address2;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) 
{
	this.salary = salary;

}


public Address getAddress1() {
	return address1;
}


public void setAddress1(Address address1) {
	this.address1 = address1;
}
public Address getAddress2() {
	return address2;
}


public void setAddress2(Address address2) {
	this.address2 = address2;
}


public void show() {
	System.out.println( name+" "+id+" "+salary);
	System.out.println(address1.toString());
	
}
public void display() {
	System.out.println( name+" "+id+" "+salary);
	System.out.println(address2.toString());
}




}
