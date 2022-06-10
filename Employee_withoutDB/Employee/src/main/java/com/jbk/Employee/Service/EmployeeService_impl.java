package com.jbk.Employee.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Employee.Entity.Employee;
import com.jbk.Employee.dao.EmployeeDao;

@Service
public class EmployeeService_impl implements EmployeeSerivce {

	@Autowired
	EmployeeDao dao;
	
	@Override
	public String addEmployee(Employee employee) {
		String msg = dao.addEmployee(employee);
		return msg;
	}

	@Override
	public ArrayList<Employee> allEmployee() {
		ArrayList<Employee> al = dao.allEmployee();
		return al;
	}

	@Override
	public Object getEmployeeById(int id) {
		Object employee = dao.getEmployeeById(id);
		return employee;
	}

	@Override
	public Object updateEmployee(int id, Employee employee) {
		return dao.updateEmployee(id, employee);
	}

	@Override
	public Object deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public ArrayList<Employee> sortBySalary() {
		return dao.sortBySalary();
	}

	@Override
	public ArrayList<Employee> sortByName() {
		return dao.sortByName();
	}

}
