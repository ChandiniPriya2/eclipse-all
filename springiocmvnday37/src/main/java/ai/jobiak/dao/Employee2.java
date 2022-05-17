package ai.jobiak.dao;

public class Employee2 {
int salary;
int id;
public Employee2() {
	
}

public Employee2(int id) {
	super();
	this.id = id;
}

public Employee2(int salary, int id) {
	super();
	this.salary = salary;
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee2 [salary=" + salary + ", id=" + id + "]";
}

}
