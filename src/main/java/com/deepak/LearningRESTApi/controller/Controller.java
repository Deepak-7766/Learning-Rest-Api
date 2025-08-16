package com.deepak.LearningRESTApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.LearningRESTApi.dto.StudentDto;
import com.deepak.LearningRESTApi.entity.Student;
import com.deepak.LearningRESTApi.repository.StudentRepository;

@RestController
public class Controller {
	
	private final StudentRepository studentRepository;

	public Controller(StudentRepository studentRepository){
		this.studentRepository=studentRepository;
	}

	@GetMapping("/student")
	public List<Student> getStudent() {
		return studentRepository.findAll();
	}
	
	
	
}
