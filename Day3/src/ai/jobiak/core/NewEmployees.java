package ai.jobiak.core;

import java.time.LocalDateTime;

public class NewEmployees {

	public static void main(String[] args) {
		Address com1=new Address("Second Floor#113","satyams","Vizag");
		Address res1=new Address("Near Hotel#143","Lakshmi","Vizag");
		Address off1=new Address("FirstFloor 504","Sita","Hyd" );
		
		Address com2=new Address("First Floor 789","Srinivas","Hyd");
		Address res2=new Address("NearPark","Navatha","Vizag");
	//	Address off2=new Address("SecondFloor","Varun","Vizag");
		
		Address com3=new Address("IT Campus","Lakshman","Mumbai");
	//	Address res3=new Address("MainBranch","Jason","Chennai");
		
		Address com4=new Address("ThirdFloor","Villa","Hyd");
		Address res4=new Address("FirstFloor123","Priya","Chennai");
		
		Employee emp1=new Employee(501,"Ram",LocalDateTime.now(),com1,res1,off1,1);
		Employee emp2=new Employee(502,"Ramya",LocalDateTime.now(),com2,res2,Employee.office,1);
		Employee emp3=new Employee(503,"Singh",LocalDateTime.now(),com3,res2,Employee.office,2);
		Employee emp4=new Employee(504,"Saara",LocalDateTime.now(),com4,res4,Employee.office,2);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		
		emp1.residence.setBuilding("Vilas");
	     System.out.println(emp1.residence);       //residence is a public member  so we can call it through its obj
	 	System.out.println(emp1.getCommu()); //commu is  a private member so we use get()
	 	System.out.println(Employee.office);      //office is a static member so we can call it by using Class name	 	
	     	}
}
