package com.abhidutta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhidutta.dto.IncomeDetailsDto;
import com.abhidutta.dto.KidsDataRequest;
import com.abhidutta.service.KidsDetailsService;

@RestController
public class KidsDetailsController {
	@Autowired
	KidsDetailsService kidsDetailsService;
	
	@PostMapping("/kidsDetails")
	public String save(@RequestBody KidsDataRequest kidsDataRequest) {
		String save = kidsDetailsService.submitKidsDetails(kidsDataRequest);
		return "Successfully Submitted." +save;
	}
}
