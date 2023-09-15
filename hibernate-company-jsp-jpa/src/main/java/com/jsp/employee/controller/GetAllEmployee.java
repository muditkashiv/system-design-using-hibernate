package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeServices;

public class GetAllEmployee {
	public static void main(String[] args) {
		EmployeeServices employeeServices = new EmployeeServices();
		employeeServices.getAllEmployee();
	}

}
