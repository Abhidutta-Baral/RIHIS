package com.abhidutta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class EducationDetails {
	@Id
	@GeneratedValue
	private Integer educationId;
	private Long caseNo;
	private String highestDegree;
	private String graduationYear;
	private String universityName;

}
