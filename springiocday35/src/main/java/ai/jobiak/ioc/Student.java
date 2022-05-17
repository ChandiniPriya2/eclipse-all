package ai.jobiak.ioc;

import java.util.Iterator;
import java.util.List;

public class Student {
private int id;
private String name;
private List<Hobbies> hobbies;
public Student(int id, String name, List<Hobbies> hobbies) {
	super();
	this.id = id;
	this.name = name;
	this.hobbies = hobbies;
}
public void display() {
//	System.out.println(id+" "+name);
	System.out.println("Hobbies are:");
	Iterator<Hobbies> itr=hobbies.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
