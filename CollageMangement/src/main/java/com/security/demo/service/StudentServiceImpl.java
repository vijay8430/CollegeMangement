package com.security.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.demo.dto.StudentDtoRequest;
import com.security.demo.dto.StudentDtoResponse;
import com.security.demo.exception.InvalidDivision;
import com.security.demo.exception.InvalidEmail;
import com.security.demo.exception.InvalidMobile;
import com.security.demo.exception.InvalidPassword;
import com.security.demo.exception.InvalidRoll;
import com.security.demo.model.Student;
import com.security.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository sr;

	@Override
	public void addStudent(StudentDtoRequest s) {
		// TODO Auto-generated method stub
		Integer roll = s.getRoll();

		if (roll != null && roll > 0) {
			if (sr.existsById(roll)) {
				throw new InvalidRoll("Roll Number Is Alreday Exits");
			}

		} else
			throw new InvalidRoll("Invalid Roll number");

		String division = s.getDivision().trim();

		if (!(division.equalsIgnoreCase("A") || division.equalsIgnoreCase("B") || division.equalsIgnoreCase("C"))) {
			throw new InvalidDivision("Only select Division A,B,C");

		}

		String password = s.getPasword().trim();
		if (!sr.existsByPasword(password)) {
			if (!(password.length() >= 6)) {
				throw new InvalidPassword("Password more than six letters");
			}
			for (int i = 0; i <= password.length(); i++) {
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

			}

		} else
			throw new InvalidPassword(" Password Is Alreday exits");

		String email = s.getEmail().trim();
		if (sr.existsByEmail(email)) {
			throw new InvalidEmail("Email Is Already exits");
		}
		if (email.endsWith("@gmail.com")) {
			throw new InvalidEmail("Email must be end with @gmail.com");

		}

		String mob = s.getMob().trim();
		if (!sr.existsByMob(mob)) {

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
			throw new InvalidMobile(" Mobile Number Is Alreday Exists");
		Student st = StudentDtoRequest.toEntity(s);

		sr.save(st);

	}

	@Override
	public List<StudentDtoResponse> display() {
		// TODO Auto-generated method stub
		List<Student> student = sr.findAll();
		return student.stream().map(StudentDtoResponse::toStudent).toList();
	}

	@Override
	public Student search(Integer roll) {
		// TODO Auto-generated method stub
		Student temp = null;
		if (sr.findById(roll).isPresent()) {
			temp = sr.findById(roll).get();
			return temp;
		}
		return null;
	}

	@Override
	public Student update(Student s, Integer roll) {
		// TODO Auto-generated method stub
		if (sr.findById(roll).isPresent()) {
			Student temp = sr.findById(roll).get();
			temp.setName(s.getName());
			temp.setEmail(s.getEmail());
			temp.setDivision(s.getDivision());
			temp.setMob(s.getMob());
			temp.setMarks(s.getMarks());
			temp.setPasword(s.getPasword());
			temp.setYear(s.getYear());
			
			Student ss=sr.save(temp);
			return ss;
		}

		
		return null;

	}

	@Override
	public StudentDtoResponse delete(Integer roll) {
		// TODO Auto-generated method stub
		if (sr.findById(roll).isPresent()) {
			Student del = sr.findById(roll).get();
			sr.deleteById(roll);
			return StudentDtoResponse.toStudent(del);
		}

		return null;
	}

}
