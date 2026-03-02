package com.security.demo.service;

import java.util.List;

import com.security.demo.dto.TeacherDtoRequset;
import com.security.demo.dto.TeacherDtoResponse;
import com.security.demo.model.Teacher;

public interface TeacherService {
	void addTeacher(TeacherDtoRequset s);

	List<TeacherDtoResponse> display();

	Teacher search(Integer id);

	TeacherDtoResponse update(Teacher s, Integer id);

	TeacherDtoResponse delete(Integer id);

	Teacher getByEmail(String email);

}
