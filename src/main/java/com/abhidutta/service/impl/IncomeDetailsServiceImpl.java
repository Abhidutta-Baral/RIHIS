package com.abhidutta.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.abhidutta.dto.IncomeDetailsDto;
import com.abhidutta.model.IncomeDetails;
import com.abhidutta.repo.IncomeDetailsRepo;
import com.abhidutta.service.IncomeDetailsService;

public class IncomeDetailsServiceImpl implements IncomeDetailsService {

	@Autowired
	IncomeDetailsRepo incomeDetailsRepo;

	@Override
	public String submitIncomeDetails(IncomeDetailsDto incomeDetailsDto) {
		IncomeDetails incomeDetails = new IncomeDetails();
		BeanUtils.copyProperties(incomeDetailsDto, incomeDetails);
		incomeDetailsRepo.save(incomeDetails);
		return incomeDetails.getCaseNo().toString();
	}

}
