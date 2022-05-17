package ai.jobiak.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDAO {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
		//CustomerDAO dao=(CustomerDAO)context.getBean("custDAO");
	   // System.out.println(dao.insertRow());
		EmployeeDao dao=(EmployeeDao)context.getBean("empDAO");
		
	//	System.out.println(dao.insertRow());
	//	System.out.println(dao.update());
	System.out.println(dao.delete());	
	}

}
