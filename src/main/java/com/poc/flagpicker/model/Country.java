package com.poc.flagpicker.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "cid")
	@JsonIgnore
	private Integer cid;

	@Column(name = "country_name")
	private String name;

	@Column(name = "flag")
	private String flag;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Continent continent;

	public Country() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
