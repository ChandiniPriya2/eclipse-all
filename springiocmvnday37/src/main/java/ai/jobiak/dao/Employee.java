package ai.jobiak.dao;

public class Employee {
String company;
int id;
String name;
int salary;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String company, int id, String name, int salary) {
	super();
	this.company = company;
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [company=" + company + ", id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
