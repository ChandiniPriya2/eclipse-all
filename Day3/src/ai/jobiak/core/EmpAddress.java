package ai.jobiak.core;

import java.time.LocalDateTime;

public class EmpAddress {
	public static void main(String[] args) {
		Address com1=new Address("Second Floor#113","satyams","Vizag");
		Address res1=new Address("Near Hotel#143","Lakshmi","Vizag");
		Address off1=new Address("FirstFloor 504","Sita","Hyd" );
		
		Address com2=new Address("First Floor 789","Srinivas","Hyd");
		Address res2=new Address("NearPark","Navatha","Vizag");
		Address off2=new Address("SecondFloor","Varun","Vizag");
		
		Address com3=new Address("IT Campus","Lakshman","Mumbai");
		Address res3=new Address("MainBranch","Jason","Chennai");
		
		Address com4=new Address("ThirdFloor","Villa","Hyd");
		Address res4=new Address("FirstFloor123","Priya","Chennai");
		
		Employee emp1=new Employee(501,"Ram",LocalDateTime.now(),com1,res1,off1,1);
		Employee emp2=new Employee(502,"Ramya",LocalDateTime.now(),com2,res2,off2,1);
		Employee emp3=new Employee(503,"Singh",LocalDateTime.now(),com3,res3,Employee.office,2);
		Employee emp4=new Employee(504,"Saara",LocalDateTime.now(),com4,res4,Employee.office,2);
		Employee add[]=new Employee[4];
		add[0]=emp1;
		add[1]=emp2;
		add[2]=emp3;
		add[3]=emp4;
		for(int i=0;i<add.length;i++) {
			System.out.println("Residential addresse of Employee @ "+ i + " is" + add[i].residence);
			
		}
	}
	

}
