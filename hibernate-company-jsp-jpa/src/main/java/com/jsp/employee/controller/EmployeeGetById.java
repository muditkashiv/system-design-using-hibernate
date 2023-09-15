package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeServices;

public class EmployeeGetById {
	public static void main(String[] args) {
		EmployeeServices employeeServices = new EmployeeServices();
		employeeServices.getByIdEmployee(1);
	}

}
