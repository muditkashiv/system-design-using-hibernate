package com.jsp.employee.service;


import java.util.List;

import com.jsp.dto.Employee;
import com.jsp.employee.dao.EmployeeDao;

public class EmployeeServices {
	EmployeeDao employeeDao = new EmployeeDao();
	
	
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	 public boolean deleteEmployee(int id) {
		 return employeeDao.deleteEmployee(id);
		 
	 }
	 
	 public Employee getByIdEmployee(int id) {
		 return employeeDao.getByIdEmployee(id);
	 }
    
	  public Employee updateEmployeeMailById(int id, String email) {
		 Employee employee = employeeDao.getByIdEmployee(id);
		 employee.setEmail(email);
		return employeeDao.updateEmployeeMailById(employee);	
		  
	  }
	  
	  public List<Employee> getAllEmployee(){
		  return employeeDao.getAllEmployee();
	  }

}
