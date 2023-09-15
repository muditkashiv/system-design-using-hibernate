package com.jsp.employee.controller;


import com.jsp.employee.service.EmployeeServices;

public class EmployeeDelete {
	public static void main(String[] args) {
		EmployeeServices employeeServices = new EmployeeServices();
		employeeServices.deleteEmployee(1);
		
	}

}
