package com.jbk.Student.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.jbk.Student.entity.Student;

@Repository
public class StudentDao_impl implements StudentDao{
	
	ArrayList<Student> al=new ArrayList<Student>();

	@Override
	public String saveStudent(Student student) {
		al.add(student);
		return "Student Data received >>"+"\n Student Id : "+student.getId();
	}

	@Override
	public ArrayList<Student> allStudent() {
		
		al.add(new Student(1, "Ganesh", "Sapate", "ganesh@gmail.com"));
		al.add(new Student(2, "Arvind", "Tekale", "arvind@gmail.com"));
		al.add(new Student(3, "Sagar", "Akolkar", "sagar@gmail.com"));
		al.add(new Student(4, "Akshay", "Tekale", "akshay@gmail.com"));
		al.add(new Student(5, "Ram", "Gunjal", "ram@gmail.com"));
		
		return al;
	}

	@Override
	public Student getStudentById(long id) {
		
		al.add(new Student(1, "Ganesh", "Sapate", "ganesh@gmail.com"));
		al.add(new Student(2, "Arvind", "Tekale", "arvind@gmail.com"));
		al.add(new Student(3, "Sagar", "Akolkar", "sagar@gmail.com"));
		al.add(new Student(4, "Akshay", "Tekale", "akshay@gmail.com"));
		al.add(new Student(5, "Ram", "Gunjal", "ram@gmail.com"));
		
		Student student = null;
		
		for(Student std:al) {
			if(std.getId()==id) {
				student=std;
			}
		}
		return student;
	}
	

}
