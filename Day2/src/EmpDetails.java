import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("EmpDetails.class");
		ThisDemo emp1=new ThisDemo(1234,"Rani",25000,"developer","vizag");
		ThisDemo emp2=new ThisDemo(4567,"Ram",15000,"tester","vizag");
		ThisDemo emp3=new ThisDemo(4789,"Saketh",24000,"developer","hyd");
		ThisDemo emp4=new ThisDemo(1489,"Ramya",100000,"Manager","vizag");
	//	System.out.println(emp1);
		logger.setLevel(Level.INFO);
		logger.log(logger.getLevel(),""+emp1);
	//	System.out.println(emp2);
		logger.log(logger.getLevel(),""+emp2);
	//	System.out.println(emp3);
		logger.log(logger.getLevel(),""+emp3);
	//	System.out.println(emp4);
		logger.log(logger.getLevel(),""+emp4);
		
		boolean result=emp1==emp2;
	//	System.out.println(result);
		logger.log(logger.getLevel(),""+result);
		emp1.setLocation("hyd");
		emp2.setPosition("developer");
		emp3.setSalary(25000);
	//	System.out.println("After updating the details:");
		logger.log(logger.getLevel(),"After updating the details:");
	//	System.out.println("employee1 shifted to " + emp1.getLocation());
		logger.log(logger.getLevel(),"employee1 shifted to " + emp1.getLocation());
	//	System.out.println("employee2 promoted as " + emp2.getPosition());
		logger.log(logger.getLevel(),"employee2  promoted as " + emp2.getPosition());
	//	System.out.println("employee3 salary incremented to " + emp3.getSalary());
		logger.log(logger.getLevel(),"employee3 salary incremented to " + emp3.getSalary());
		}
}
