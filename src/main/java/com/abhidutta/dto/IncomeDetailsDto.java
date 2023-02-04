package com.abhidutta.dto;

import lombok.Data;

@Data
public class IncomeDetailsDto {
	private Integer incomeId;
	private Long caseNo;
	private Long monthlySalary;
	private Long rentIncome;
	private Long propertyIncome;
}
