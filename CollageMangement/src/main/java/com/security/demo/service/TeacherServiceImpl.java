package com.security.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.demo.dto.TeacherDtoRequset;
import com.security.demo.dto.TeacherDtoResponse;
import com.security.demo.exception.InvalidEmail;
import com.security.demo.exception.InvalidId;
import com.security.demo.exception.InvalidMobile;
import com.security.demo.exception.InvalidPassword;
import com.security.demo.model.Teacher;
import com.security.demo.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	private TeacherRepository tr;

	@Override
	public void addTeacher(TeacherDtoRequset s) {
		// TODO Auto-generated method stub
		Integer id = s.getId();

		if (id > 0) {
			if (tr.existsById(id)) {
				throw new InvalidId("Duplicate Id");
			}

		} else
			throw new InvalidId("Invalid Id!!");

		String mob = s.getMob().trim();
		if (!tr.existsByMob(mob)) {

			if (mob.startsWith("+91")) {
				mob = mob.substring(3);
			} else
				throw new InvalidMobile("Start with +91");

			if (mob.length() == 10) {
				if (mob.charAt(0) == '1' || mob.charAt(0) == '2' || mob.charAt(0) == '3' || mob.charAt(0) == '4'
						|| mob.charAt(0) == '5' || mob.charAt(0) == '0') {
					throw new InvalidMobile("Not Start With 0,1,2,3,4,5");
				}
				for (int i = 0; i < mob.length(); i++) {
					if (!Character.isDigit(mob.charAt(i))) {
						throw new InvalidMobile("Character Not Allowed");
					}

				}
			} else
				throw new InvalidMobile("Only 10 Digit Allow");
		} else
			throw new InvalidMobile("Alreday Exists");

		String email = s.getEmail().trim();
		if (tr.existsByEmail(email)) {
			throw new InvalidEmail("Already exits");
		} else {
			if (email.endsWith("@gmail.com")) {
				throw new InvalidEmail("Email must be end with @gmail.com");

			}

		}
//		String password = s.getPassword().trim();
//		if (!tr.existsBypassword(password)) {
//			if (!(password.length() >= 6)) {
//				throw new InvalidPassword("Password more than six letters");
//			}
//			for (int i = 0; i < password.length(); i++) {
//				if (!(password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$'
//						|| password.charAt(i) == '&' || password.charAt(i) == '*')) {
//					throw new InvalidPassword("At least one special symbole");
//
//				}
//				if (!(password.charAt(i) == '0' || password.charAt(i) == '1' || password.charAt(i) == '2'
//						|| password.charAt(i) == '2' || password.charAt(i) == '3' || password.charAt(i) == '4'
//						|| password.charAt(i) == '5' || password.charAt(i) == '6' || password.charAt(i) == '7'
//						|| password.charAt(i) == '8' || password.charAt(i) == '9')) {
//					throw new InvalidPassword("At least one number allowed");
//
//				}
//
//			}
//
//		} else
//			throw new InvalidPassword("Alreday exits");

		String password = s.getPassword().trim();

		if (!tr.existsBypassword(password)) {

			if (password.length() < 6) {
				throw new InvalidPassword("Password must be at least 6 characters");
			}

			boolean hasSpecial = false;
			boolean hasDigit = false;

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);

				if (ch == '@' || ch == '#' || ch == '$' || ch == '&' || ch == '*') {
					hasSpecial = true;
				}

				if (Character.isDigit(ch)) {
					hasDigit = true;
				}
			}

			if (!hasSpecial) {
				throw new InvalidPassword("At least one special symbol required");
			}

			if (!hasDigit) {
				throw new InvalidPassword("At least one number required");
			}

		} else {
			throw new InvalidPassword("Already exists");
		}

		Teacher t = TeacherDtoRequset.toEntity(s);
		tr.save(t);

	}

	@Override
	public List<TeacherDtoResponse> display() {
		// TODO Auto-generated method stub
		List<Teacher> teacher = tr.findAll();
		return teacher.stream().map(TeacherDtoResponse::toDto).toList();

	}

	@Override
	public Teacher search(Integer id) {
		// TODO Auto-generated method stub
		Teacher temp = null;
		if (tr.findById(id).isPresent()) {
			temp = tr.findById(id).get();
			return temp;
		}
		return null;
	}


	@Override
	public TeacherDtoResponse delete(Integer id) {
		// TODO Auto-generated method stub
		Teacher del = null;
		if (tr.findById(id).isPresent()) {
			del = tr.findById(id).get();
			tr.deleteById(id);
			return TeacherDtoResponse.toDto(del);
		}
		return null;

	}

	@Override
	public Teacher getByEmail(String email) {
		// TODO Auto-generated method stub
		return tr.findByEmail(email);
	}

	@Override
	public TeacherDtoResponse update(Teacher s, Integer id) {
		// TODO Auto-generated method stub
		
		
		if(tr.findById(id).isPresent()) {
			
			Teacher temp=tr.findById(id).get();
			
			temp.setName(s.getName());
			temp.setEmail(s.getEmail());
			temp.setMob(s.getMob());
			temp.setPassword(s.getPassword());
			
			Teacher dd=tr.save(temp);
			
			return TeacherDtoResponse.toDto(dd);
		}
		
		return null;
	}
}
