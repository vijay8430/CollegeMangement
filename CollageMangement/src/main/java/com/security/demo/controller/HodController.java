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

import com.security.demo.dto.HodDtoRequest;
import com.security.demo.dto.HodDtoResponse;
import com.security.demo.model.HoD;
import com.security.demo.service.HoDService;

@RestController
@RequestMapping("/hod")
public class HodController {
	@Autowired
	private HoDService hod;
	@PostMapping("add")
	public void addHod(@RequestBody  HodDtoRequest h) {
		hod.addHod(h);
	}
	@GetMapping("display")
	public List<HodDtoResponse>display(){
		return hod.display();
		
	}
	@DeleteMapping("delete/{id}")
	public 	HodDtoResponse delete(@PathVariable Integer id) {
		return hod.delete(id);
	}

	@PutMapping("update/{id}")
	public HoD update(@RequestBody HoD s,@PathVariable Integer id) {
		return hod.update(s, id);
		
	}

}
