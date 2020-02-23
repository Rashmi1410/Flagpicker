package com.poc.flagpicker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.poc.flagpicker.exception.CountryNotFoundException;
import com.poc.flagpicker.model.Continent;
import com.poc.flagpicker.repository.CountryRepository;
import com.poc.flagpicker.service.ContinentServiceImpl;

@RestController
@RequestMapping("/flagpicker")
public class FlagPickerController {
	
	@Autowired
	ContinentServiceImpl continentService;
	
	@Autowired
	CountryRepository countryRepository;
	
	
	@GetMapping("/world")
	public List<Continent> getAllContinent()
	{
		return continentService.findAll();
	}
	
	@GetMapping("/flag/{name}")
	public String findByName(@PathVariable String name) throws CountryNotFoundException {
		String flag = countryRepository.findByName(name);
		return flag;
		
	}
	
	

}
