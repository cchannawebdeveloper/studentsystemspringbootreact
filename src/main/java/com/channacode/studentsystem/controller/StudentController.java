package com.channacode.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.channacode.studentsystem.model.Student;
import com.channacode.studentsystem.service.StudentService;

@RestController
//@CrossOrigin(origins = "http://localhost:3000") No need
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		service.saveStudent(student);
		////result.getId();
		return "New student is added sucessfully!";
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}

}
