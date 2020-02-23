package com.poc.flagpicker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.flagpicker.model.Continent;

@Repository
public interface ContinentRepository extends JpaRepository<Continent, Integer> {
	

}
