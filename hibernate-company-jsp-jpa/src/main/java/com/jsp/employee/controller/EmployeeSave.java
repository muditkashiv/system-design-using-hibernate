package com.jsp.employee.controller;

import com.jsp.dto.Employee;
import com.jsp.employee.service.EmployeeServices;

public class EmployeeSave {
	
	public static void main(String[] args) {
		EmployeeServices employeeServices = new EmployeeServices();
		
		 Employee employee1 = new Employee();
			//employee.setId(1);
			employee1.setName("rayy");
			employee1.setEmail("rayy@gmail.com");
			employee1.setCno(557800999); 
			 
		employeeServices.saveEmployee(employee1);
		
	}

}
