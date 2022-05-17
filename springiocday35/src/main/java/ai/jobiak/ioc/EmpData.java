package ai.jobiak.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpData {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Employee ref=(Employee)context.getBean("empdata");
		Employee ref2=(Employee)context.getBean("empdata2");
		ref.show();
	ref2.display();
	}

}
