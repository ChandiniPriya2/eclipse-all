package ai.jobiak.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
     // A a=context.getBean("a",A.class);
      //a.display();
		Question q=(Question)context.getBean("answers");
		System.out.println(q);
	}

}
