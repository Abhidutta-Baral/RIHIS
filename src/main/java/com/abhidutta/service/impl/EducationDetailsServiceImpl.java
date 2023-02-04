package com.abhidutta.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.abhidutta.dto.EducationDetailsDto;
import com.abhidutta.model.EducationDetails;
import com.abhidutta.repo.EducationDetailsRepo;
import com.abhidutta.service.EducationDetailsService;

public class EducationDetailsServiceImpl implements EducationDetailsService {
	@Autowired
	EducationDetailsRepo educationDetailsRepo;

	@Override
	public String submitEducationDetails(EducationDetailsDto educationDetailsDto) {
		EducationDetails educationDetails = new EducationDetails();
		BeanUtils.copyProperties(educationDetailsDto, educationDetails);
		educationDetailsRepo.save(educationDetails);
		return educationDetails.getCaseNo().toString();
	}

}
