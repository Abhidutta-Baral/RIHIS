package com.abhidutta.service;

import com.abhidutta.dto.PlanSectionDto;

public interface PlanSectionService {
	public String createCase(int appId);
	public String submitPlan(PlanSectionDto planSectionDto);

}
