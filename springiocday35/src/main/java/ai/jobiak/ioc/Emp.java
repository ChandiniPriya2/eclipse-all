package ai.jobiak.ioc;

public class Emp {
int id;
String name;
int salary;
public Emp(int id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}
