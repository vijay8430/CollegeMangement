package com.security.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.dto.StudentDtoRequest;
import com.security.demo.dto.StudentDtoResponse;
import com.security.demo.model.Student;
import com.security.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class Studentcontroller {

	@Autowired
	private StudentService ss;

	@PostMapping("add")
	public void addStudent(@RequestBody StudentDtoRequest s) {
		ss.addStudent(s);
	}

	@GetMapping("display")
	public List<StudentDtoResponse> display() {
		return ss.display();

	}

	@DeleteMapping("delete/{roll}")
	public StudentDtoResponse delete(@PathVariable Integer roll) {

		return ss.delete(roll);

	}

	@PutMapping("update/{roll}")
	public Student update(@RequestBody Student s, @PathVariable Integer roll) {
		return ss.update(s, roll);

	}

}
