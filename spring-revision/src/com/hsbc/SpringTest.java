package com.hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Test test1 = (Test) context.getBean("t1");
		Test test2 = (Test) context.getBean("t1");
	}
}
