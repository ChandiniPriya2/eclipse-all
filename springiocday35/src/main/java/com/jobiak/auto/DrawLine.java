package com.jobiak.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawLine {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); 
		Line line=(Line)context.getBean("line");
		line.draw();

	}

}
