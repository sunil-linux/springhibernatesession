package com.sunRays.beans;

public class EmployeeBean
{
    private String fullName;
      
    private DepartmentBean departmentBeanNew;
  
   
    public String getFullName() {
        return fullName;
    }
  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

	public DepartmentBean getDepartmentBeanNew() {
		return departmentBeanNew;
	}

	public void setDepartmentBeanNew(DepartmentBean departmentBeanNew) {
		this.departmentBeanNew = departmentBeanNew;
	}
}
