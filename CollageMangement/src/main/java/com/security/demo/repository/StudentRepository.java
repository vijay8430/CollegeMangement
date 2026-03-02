package com.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.demo.model.Student;
import com.security.demo.model.Teacher;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByEmail(String email);

	boolean existsByDivision(String division);

	boolean existsByEmail(String email);

	boolean existsByPasword(String pasword);

	boolean existsByMob(String mob);

}
