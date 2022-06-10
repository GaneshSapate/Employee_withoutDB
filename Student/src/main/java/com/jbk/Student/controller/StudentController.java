package com.jbk.Student.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Student.entity.Student;
import com.jbk.Student.serivce.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/postStudent")
	public String getStudent(@RequestBody Student student) {
		String msg = service.saveStudent(student);	
		return msg;	
	}
	
	@GetMapping("/allStudent")
	public ArrayList<Student> allStudent(){
		ArrayList<Student> al = service.allStudent();
		return al;
		
	}
	
	@PostMapping("/getStudentById")
	public Student getStudentById(@RequestBody long id) {
		Student student = service.getStudentById(id);
		return student;
		
	}
	

}
