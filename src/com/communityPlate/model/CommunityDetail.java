package com.communityPlate.model;

/**
 * CommunityDetail entity. @author MyEclipse Persistence Tools
 */

public class CommunityDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private String detail;
	private String img;

	// Constructors

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}