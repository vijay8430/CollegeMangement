package com.security.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.demo.dto.HodDtoRequest;
import com.security.demo.dto.HodDtoResponse;
import com.security.demo.exception.InvalidDept;
import com.security.demo.exception.InvalidEmail;
import com.security.demo.exception.InvalidMobile;
import com.security.demo.exception.InvalidPassword;
import com.security.demo.exception.InvalidRole;
import com.security.demo.exception.InvalidUsername;
import com.security.demo.model.HoD;
import com.security.demo.repository.HoDRepository;

@Service
public class HoDServiceImpl implements HoDService {
	@Autowired
	private HoDRepository hr;

	@Override
	public void addHod(HodDtoRequest s) {
		// TODO Auto-generated method stub

		String password = s.getPassword();
		if (!hr.existsByPassword(password)) {
			if (!(password.length() >= 6)) {
				throw new InvalidPassword("Password more than six letters");
			}

		} else
			throw new InvalidPassword(" Password Is Alreday exits");

		String email = s.getEmail().trim();
		if (hr.existsByEmail(email)) {
			throw new InvalidEmail(" Email Is Already exits");
		}
		if (email.endsWith("@gmail.com")) {
			throw new InvalidEmail("Email must be end with @gmail.com");

		}

		String dept = s.getDept().trim();

		if (!dept.equalsIgnoreCase("BCA") || dept.equalsIgnoreCase("BCS") || dept.equals("MCA")
				|| dept.equalsIgnoreCase("MSC")) {
			throw new InvalidDept("Only select (BCA,BCS,MCA,MSC)");
		}

		String mob = s.getMob().trim();
		if (!hr.existsByMob(mob)) {

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
			throw new InvalidMobile("Mobile Number  Alreday Exists");
		HoD ho = HodDtoRequest.toEntity(s);

		hr.save(ho);

	}

	@Override
	public List<HodDtoResponse> display() {
		// TODO Auto-generated method stub
		List<HoD> hod = hr.findAll();
		return hod.stream().map(HodDtoResponse::toDto).toList();
	}

	@Override
	public HoD search(Integer id) {
		// TODO Auto-generated method stub
		HoD temp = null;
		if (hr.findById(id).isPresent()) {
			temp = hr.findById(id).get();
			return temp;
		}
		return null;
	}

	@Override
	public HoD update(HoD s, Integer id) {
		if (hr.findById(id).isPresent()) {
			HoD hod = hr.findById(id).get();
			hod.setName(s.getName());
			hod.setDept(s.getDept());
			hod.setEmail(s.getEmail());
			hod.setExp(s.getExp());
			hod.setMob(s.getMob());
			hod.setPassword(s.getPassword());
			HoD hh = hr.save(hod);
			return hh;

		}
		return null;
	}

	@Override
	public HodDtoResponse delete(Integer id) {
		// TODO Auto-generated method stub
		HoD del = null;
		if (hr.findById(id).isPresent()) {
			del = hr.findById(id).get();
			hr.deleteById(id);
			return HodDtoResponse.toDto(del);
		}
		return null;
	}

}
