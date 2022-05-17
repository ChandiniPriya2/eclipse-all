package ai.jobiak.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StuData {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
     Student ref=(Student)context.getBean("stu");
     ref.display();
	}

}
