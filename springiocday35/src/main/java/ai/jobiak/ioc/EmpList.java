package ai.jobiak.ioc;

import java.util.Iterator;
import java.util.List;

public class EmpList {
private List<Emp>empList;

public EmpList(List<Emp> empList) {
	super();
	this.empList = empList;
}

public List<Emp> getEmpList() {
	return empList;
}

public void setEmpList(List<Emp> empList) {
	this.empList = empList;
}

public void display() {

	System.out.println("Employees are:");
	Iterator<Emp> itr=empList.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
