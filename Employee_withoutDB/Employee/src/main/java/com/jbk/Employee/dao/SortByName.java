package com.jbk.Employee.dao;

import java.util.Comparator;

import com.jbk.Employee.Entity.Employee;

public class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEname().compareTo(o2.getEname());
	}
	

}
