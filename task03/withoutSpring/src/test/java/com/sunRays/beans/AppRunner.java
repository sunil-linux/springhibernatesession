package com.sunRays.beans;

public class AppRunner {

	public static void main(String[] args) {
		DepartmentBean departmentBean=new DepartmentBean();
		departmentBean.setName("LifeTech");
		
		EmployeeBean employee = new EmployeeBean();
		employee.setFullName("Sunil Kumar Gupta");
		employee.setDepartmentBean(departmentBean);
		
		System.out.println("--------------- Setter ()----------------");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartmentBean().getName());
		
		EmployeeBean employee2 = new EmployeeBean(departmentBean);
		employee2.setFullName("Sunil");
		
		System.out.println("--------------- Constructor()----------------");
		System.out.println(employee2.getFullName());
		System.out.println(employee2.getDepartmentBean().getName());
		

	}

}
