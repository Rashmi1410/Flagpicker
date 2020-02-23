package com.poc.flagpicker.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "continent")
public class Continent {

	@Id
	@GeneratedValue
	@Column(name = "id")
	@JsonIgnore
	private Integer id;

	@Column(name = "continent_name")
	private String continentName;

	@OneToMany(mappedBy = "continent")
	private List<Country> countries;

	public Continent() {
		super();
	}

	public Continent(String continentName, List<Country> countries) {
		super();
		this.continentName = continentName;
		this.countries = countries;
	}

	public Continent(Integer id, String continentName, List<Country> countries) {
		super();
		this.id = id;
		this.continentName = continentName;
		this.countries = countries;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	

}
