package com.abhidutta.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.abhidutta.dto.KidDetailsDto;
import com.abhidutta.dto.KidsDataRequest;
import com.abhidutta.model.KidsDetails;
import com.abhidutta.repo.KidsDetailsRepo;
import com.abhidutta.service.KidsDetailsService;

public class KidsDetailsServiceImpl implements KidsDetailsService {
	@Autowired
	KidsDetailsRepo kidsDetailsRepo;

	@Override
	public String submitKidsDetails(KidsDataRequest kidsDataRequest) {
		KidsDetails kids = new KidsDetails();
		long caseNo = kidsDataRequest.getCaseNo();
		String caseNoValue = String.valueOf(caseNo);
		for (KidDetailsDto kidsDetailsDto : kidsDataRequest.kidsList) {
			BeanUtils.copyProperties(kidsDataRequest, kids);
			kids.setCaseNo(caseNo);
			kidsDetailsRepo.save(kids);
		}

		return caseNoValue;
	}

}
