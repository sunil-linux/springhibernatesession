package com.sunRays.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean
{
    private String fullName;
    
    
    private DepartmentBean departmentBean;
    
    
    public EmployeeBean(){
    	
    }
    
    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }
  
 
    public String getFullName() {
        return fullName;
    }
  
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Autowired
	public void setDepartmentBean(DepartmentBean departmentBean) {
		this.departmentBean = departmentBean;
	}
}
