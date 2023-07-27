package com.learn.spring.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
				
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
			Student student	= context.getBean("stu", Student.class);
			
			System.out.println(student.toString());
			student.cheating();
			

	}

}
