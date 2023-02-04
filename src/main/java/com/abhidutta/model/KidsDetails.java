package com.abhidutta.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class KidsDetails {
	@Id
	@GeneratedValue
	private Integer kidsId;
	private Long caseNo;
	private String kidName;
	private String kidsAge;
	private String kidsSsn;
}
