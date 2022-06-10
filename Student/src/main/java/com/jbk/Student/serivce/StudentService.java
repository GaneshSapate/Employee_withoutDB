package com.jbk.Student.serivce;

import java.util.ArrayList;

import com.jbk.Student.entity.Student;

public interface StudentService {
	
	public String saveStudent(Student student);
	
	public ArrayList<Student> allStudent();
	
	public Student getStudentById(long id);

}
