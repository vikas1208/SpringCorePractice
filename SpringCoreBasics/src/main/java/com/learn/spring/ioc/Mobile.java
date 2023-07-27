package com.learn.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
			ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
			System.out.println("config loaded..."); 
			
	//		Vodafone voda = (Vodafone)context.getBean("vodafone");
			Vodafone voda = context.getBean("vodafone", Vodafone.class);
			
			voda.data();
			voda.calling();
	}

}
