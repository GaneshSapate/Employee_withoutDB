package com.jbk.Employee.dao;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Repository;

import com.jbk.Employee.Entity.Employee;

@Repository
public class EmployeeDao_impl implements EmployeeDao {

	ArrayList<Employee> al = new ArrayList<Employee>();

	@Override
	public String addEmployee(Employee employee) {
		al.add(employee);
		return "Employee Data received>>>" + "Employee id : " + employee.getEid();
	}

	@Override
	public ArrayList<Employee> allEmployee() {

		return al;
	}

	@Override
	public Object getEmployeeById(int id) {

		Object employee = null;

		for (Employee e : al) {
			if (e.getEid() == id) {
				employee = e;
				break;
			} else {
				employee = id + " not available in database";
			}
		}

		return employee;
	}

	@Override
	public Object updateEmployee(int id, Employee employee) {

		Object obj = null;

		for (Employee e : al) {
			if (id == e.getEid()) {
				e.setEname(employee.getEname());
				e.setSalary(employee.getSalary());
				obj = e;
				break;
			} else {
				obj = id + " not found in database";
			}
		}

		return obj;
	}

	@Override
	public Object deleteEmployee(int id) {

		Object str = null;

		for (Employee e : al) {
			if (id == e.getEid()) {
				al.remove(e);
				str = id + " remove from database";
				break;
			} else {
				str = id + " not found in database";
			}
		}
		return str;
	}

	@Override
	public ArrayList<Employee> sortBySalary() {
		
		Collections.sort(al, new SortBySalary());
		
		return al;
	}

	@Override
	public ArrayList<Employee> sortByName() {
		Collections.sort(al,new SortByName());
		return al;
	}
	

}
