package com.abhidutta.dto;

import java.util.List;

import lombok.Data;

@Data
public class KidsDataRequest {
	public long caseNo;
	public List<KidDetailsDto> kidsList;

}
