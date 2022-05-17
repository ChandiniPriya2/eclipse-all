package ai.jobiak.mvc;

public class User2 {
int id;
int salary;
public User2() {
	// TODO Auto-generated constructor stub
}
public User2(int id, int salary) {
	super();
	this.id = id;
	this.salary = salary;
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
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "User2 [id=" + id + ", salary=" + salary + "]";
}

}
