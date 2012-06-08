package com.communityPlate.model;

import java.util.HashSet;
import java.util.Set;

/**
 * CommunityInfo entity. @author MyEclipse Persistence Tools
 */

public class CommunityInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String img;
	private String state;
	private int type;

	// Constructors

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

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}