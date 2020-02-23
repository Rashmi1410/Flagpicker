package com.poc.flagpicker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.flagpicker.model.Continent;
import com.poc.flagpicker.repository.ContinentRepository;

@Service
public class ContinentServiceImpl implements ContinentService{
	
	@Autowired
	ContinentRepository continentRepository;

	@Override
	public List<Continent> findAll() {
		// TODO Auto-generated method stub
		return continentRepository.findAll() ;
	}

	
	
	

}
