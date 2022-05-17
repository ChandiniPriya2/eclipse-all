package ai.jobiak.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrepare {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
		EmpPrepStmt dao=(EmpPrepStmt)context.getBean("empPrep");
//	System.out.println(dao.insert(new Employee("jobiak",531,"Kim",20077)));
//	System.out.println(	dao.update(new Employee2(4000,502)));
	System.out.println(	dao.delete(new Employee2(110)));
	}

}
