package com.sunRays.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import com.sunRays.beans.EmployeeBean;
public class AppRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );
		//BeanFactory bf=new XmlBeanFactory(new FileSystemResource("applicationContext.xml"));
		
		EmployeeBean employee = (EmployeeBean) context.getBean("employeeId");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartmentBean().getName());
		
		

	}

}
