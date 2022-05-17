package ai.jobiak.dao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResult {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
		ResultSetEmp employee=(	ResultSetEmp )context.getBean("result");
		List<Employee> list=employee.getAll();
	for(Employee e:list) {
		System.out.println(e);
	}

	}

}
