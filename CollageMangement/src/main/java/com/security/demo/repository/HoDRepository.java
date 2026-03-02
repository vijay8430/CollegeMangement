package com.security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.demo.model.HoD;
import com.security.demo.model.Teacher;

@Repository
public interface HoDRepository extends JpaRepository<HoD, Integer> {
	HoD findByEmail(String email);

	boolean existsByEmail(String email);

	boolean existsByPassword(String password);

	boolean existsByDept(String dept);

	boolean existsByMob(String mob);

}
