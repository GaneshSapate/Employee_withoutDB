package com.jbk.Employee.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Employee.Entity.Employee;
import com.jbk.Employee.Service.EmployeeSerivce;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	EmployeeSerivce service;

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		String msg = service.addEmployee(employee);
		return msg;
	}

	@GetMapping("/allEmployee")
	public ArrayList<Employee> allEmployee() {
		return service.allEmployee();
	}

	@GetMapping("/getEmployeeById/{eid}")
	public Object getEmployeeById(@PathVariable int eid) {
		return service.getEmployeeById(eid);

	}

	@DeleteMapping("/deleteEmployee/{eid}")
	public Object deleteEmployee(@PathVariable int eid) {
		return service.deleteEmployee(eid);
	}

	@PostMapping("/updateEmployee/{eid}")
	public Object updateEmployee(@PathVariable int eid, @RequestBody Employee employee) {
		return service.updateEmployee(eid, employee);
	}

	@GetMapping("/sortBySalary")
	public ArrayList<Employee> sortBySalary() {
		return service.sortBySalary();
	}

	@GetMapping("/sortByName")
	public ArrayList<Employee> sortByName() {
		return service.sortByName();
	}

}
