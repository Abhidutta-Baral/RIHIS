package com.abhidutta.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhidutta.model.KidsDetails;

public interface KidsDetailsRepo extends JpaRepository<KidsDetails, Integer> {

}
