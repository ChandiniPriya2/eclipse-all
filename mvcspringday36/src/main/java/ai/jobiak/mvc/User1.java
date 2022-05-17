package ai.jobiak.mvc;

public class User1 {
int id;
String name;
int salary;

public User1() {
	// TODO Auto-generated constructor stub
}

public User1(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
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
	return "User1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}




}
