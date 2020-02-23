package com.poc.flagpicker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poc.flagpicker.model.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	@Query("SELECT c.flag from Country c where c.name = :name")
	public String findByName(@Param(value = "name") String name);
	
	

}
