package com.abhidutta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class IncomeDetails {
	@Id
	@GeneratedValue
	private int incomeId;
	private Long caseNo;
	private Long monthlySalary;
	private Long rentIncome;
	private Long propertyIncome;

}
