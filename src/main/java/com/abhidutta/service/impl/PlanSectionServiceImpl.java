package com.abhidutta.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhidutta.dto.ARApiDto;
import com.abhidutta.dto.PlanSectionDto;
import com.abhidutta.model.PlanSection;
import com.abhidutta.repo.PlanSectionRepo;
import com.abhidutta.service.PlanSectionService;
import com.abhidutta.util.FiegnServiceUtil;

@Service
public class PlanSectionServiceImpl implements PlanSectionService {

	@Autowired
	FiegnServiceUtil fiegnServiceUtil;

	@Autowired
	PlanSectionRepo planSectionRepo;

	@Override
	public String createCase(int appId) {
		ARApiDto citizenById = fiegnServiceUtil.getCitizenById(appId);
		PlanSection planSection = new PlanSection();
		if (citizenById != null) {
			planSection.setAppId(citizenById.getAppId());
			PlanSection save = planSectionRepo.save(planSection);
			Long caseNo = save.getCaseNo();
			return caseNo.toString();
		}

		return "App id Not found";
	}

	@Override
	public String submitPlan(PlanSectionDto planSectionDto) {
		PlanSection planSection = new PlanSection();
		BeanUtils.copyProperties(planSectionDto, planSection);
		PlanSection save = planSectionRepo.save(planSection);
		Long caseNo = save.getCaseNo();
		return caseNo.toString();
	}

}
