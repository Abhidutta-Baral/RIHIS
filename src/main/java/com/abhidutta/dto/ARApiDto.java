package com.abhidutta.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ARApiDto {
	Integer appId;
	String fullName;
	String email;
	String mobile;
	String ssn;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dob;
	private String gender;

}
