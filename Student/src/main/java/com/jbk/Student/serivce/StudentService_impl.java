package com.jbk.Student.serivce;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Student.dao.StudentDao;
import com.jbk.Student.entity.Student;

@Service
public class StudentService_impl implements StudentService{
	
	@Autowired
	private StudentDao dao;

	@Override
	public String saveStudent(Student student) {
		String msg = dao.saveStudent(student);
		return msg;
	}

	@Override
	public ArrayList<Student> allStudent() {
		ArrayList<Student> al = dao.allStudent();
		return al;
	}

	@Override
	public Student getStudentById(long id) {
		Student student = dao.getStudentById(id);
		return student;
	}
	

}
