package com.communityPlate.model;

import java.util.HashSet;
import java.util.Set;

/**
 * CommunityCatalog entity. @author MyEclipse Persistence Tools
 */

public class CommunityCatalog implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}