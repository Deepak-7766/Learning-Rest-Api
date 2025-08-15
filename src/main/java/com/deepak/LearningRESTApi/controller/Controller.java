package com.deepak.LearningRESTApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.LearningRESTApi.dto.StudentDto;

@RestController
public class Controller {
	
	@GetMapping("/student")
	public StudentDto getStudent() {
		return new StudentDto(10L,"ABC","ABC@gmail.com");
	}
	
	
}
