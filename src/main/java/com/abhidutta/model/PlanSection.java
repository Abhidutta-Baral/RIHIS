package com.abhidutta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PlanSection {
	@Id
	@GeneratedValue
	private Long caseNo;
	private Integer appId;
	private Integer planId;

}
