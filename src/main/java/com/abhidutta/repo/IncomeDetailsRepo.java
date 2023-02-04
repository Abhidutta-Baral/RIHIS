package com.abhidutta.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhidutta.model.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Integer> {

}
