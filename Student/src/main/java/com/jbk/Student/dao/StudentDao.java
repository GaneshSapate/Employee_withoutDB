package com.jbk.Student.dao;

import java.util.ArrayList;

import com.jbk.Student.entity.Student;

public interface StudentDao {
	
	public String saveStudent(Student student);
	
	public ArrayList<Student> allStudent();
	
	public Student getStudentById(long id);

}
