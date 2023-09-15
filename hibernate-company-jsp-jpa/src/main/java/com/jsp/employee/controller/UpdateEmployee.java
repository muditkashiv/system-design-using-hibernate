package com.jsp.employee.controller;


import com.jsp.employee.service.EmployeeServices;

public class UpdateEmployee {
	public static void main(String[] args) {
		EmployeeServices employeeServices = new EmployeeServices();
		employeeServices.updateEmployeeMailById(1, "abc@gmailcom");	
	}

}
