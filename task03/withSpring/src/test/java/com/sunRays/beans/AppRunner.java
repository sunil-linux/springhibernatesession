package com.sunRays.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });

		EmployeeBean employee = (EmployeeBean) context.getBean("employee");
	
		
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartmentBean().getName());
		
		

	}

}
