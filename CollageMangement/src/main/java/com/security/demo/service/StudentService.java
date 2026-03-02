package com.security.demo.service;

import java.util.List;

import com.security.demo.dto.StudentDtoRequest;
import com.security.demo.dto.StudentDtoResponse;
import com.security.demo.model.Student;

public interface StudentService {
	void addStudent(StudentDtoRequest s);

	List<StudentDtoResponse> display();
	Student search(Integer roll);
	Student update(Student s,Integer roll);

	StudentDtoResponse delete(Integer roll);

}
