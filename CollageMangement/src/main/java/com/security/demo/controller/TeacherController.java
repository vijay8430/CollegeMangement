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

import com.security.demo.dto.TeacherDtoRequset;
import com.security.demo.dto.TeacherDtoResponse;
import com.security.demo.model.Teacher;
import com.security.demo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	private TeacherService ts;

	@PostMapping("add")
	public void add(@RequestBody TeacherDtoRequset t) {
		ts.addTeacher(t);
	}

	@GetMapping("display")
	public List<TeacherDtoResponse> display() {

		return ts.display();
	}
	@DeleteMapping("delete/{id}")
	public 	TeacherDtoResponse delete(@PathVariable Integer id) {
		return ts.delete(id);
		
	}
	@PutMapping("update/{id}")
	public TeacherDtoResponse update(@RequestBody Teacher s,@PathVariable Integer id) {
		return ts.update(s, id);
		
	}


}
