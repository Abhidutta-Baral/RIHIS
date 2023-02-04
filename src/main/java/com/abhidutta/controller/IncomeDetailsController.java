package com.abhidutta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhidutta.dto.IncomeDetailsDto;
import com.abhidutta.dto.PlanSectionDto;
import com.abhidutta.service.IncomeDetailsService;

@RestController
public class IncomeDetailsController {
	@Autowired
	IncomeDetailsService incomeDetailsService;
	
	
	@PostMapping("/incomeDetails")
	public String save(@RequestBody IncomeDetailsDto incomeDetailsDto) {
		String save = incomeDetailsService.submitIncomeDetails(incomeDetailsDto);
		return "Successfully Submitted." +save;
	}
}
