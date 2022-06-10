package com.jbk.Employee.Service;

import java.util.ArrayList;

import com.jbk.Employee.Entity.Employee;

public interface EmployeeSerivce {

	public String addEmployee(Employee employee);

	public ArrayList<Employee> allEmployee();
	
	public Object getEmployeeById(int id);
	
	public Object updateEmployee(int id, Employee employee);
	
	public Object deleteEmployee(int id);
	
	public ArrayList<Employee> sortBySalary();
	
	public ArrayList<Employee> sortByName();

}
