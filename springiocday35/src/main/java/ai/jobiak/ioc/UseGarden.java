package ai.jobiak.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseGarden {

	public static  void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
			Garden ref=  (Garden) context.getBean("garden");
			System.out.println(ref);
			}

}
