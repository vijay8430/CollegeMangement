package com.security.demo.service;

import java.util.List;

import com.security.demo.dto.HodDtoRequest;
import com.security.demo.dto.HodDtoResponse;
import com.security.demo.model.HoD;


public interface HoDService {
	void addHod(HodDtoRequest s);

	List<HodDtoResponse> display();

	HoD search(Integer id);

	HoD update(HoD s, Integer id);

	HodDtoResponse delete(Integer id);

}
