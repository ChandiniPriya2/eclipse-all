package ai.jobiak.inheritance;

import java.time.LocalDateTime;

public class InheritAddress  {

	public static void main(String[] args) {
		ResidAddress resid=new ResidAddress("123","Dilshuknagar","Hyd","Lakshmi","universal gym","10");
		OfficeAddress off=new OfficeAddress("3456","Sector1","hyd","Singh",404,"ABC");
		Employee emp=new Employee(502,"Singh",LocalDateTime.now(),off,resid,2);
		System.out.println(emp);
	}

}
