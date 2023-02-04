package com.abhidutta.dto;

import lombok.Data;

@Data
public class EducationDetailsDto {
	private Integer educationId;
	private Long caseNo;
	private String highestDegree;
	private String graduationYear;
	private String universityName;
}
