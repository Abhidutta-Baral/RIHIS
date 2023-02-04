package com.abhidutta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhidutta.dto.EducationDetailsDto;
import com.abhidutta.dto.IncomeDetailsDto;
import com.abhidutta.service.EducationDetailsService;
import com.abhidutta.service.IncomeDetailsService;

@RestController
public class EducationDetailsController {
	@Autowired
	EducationDetailsService educationDetailsService;
	
	
	@PostMapping("/educationDetails")
	public String save(@RequestBody EducationDetailsDto educationDetailsDto) {
		String save = educationDetailsService.submitEducationDetails(educationDetailsDto);
		return "Successfully Submitted." + save;
	}
}
