package com.channacode.studentsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.channacode.studentsystem.model.Student;

@Service
public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();

}
