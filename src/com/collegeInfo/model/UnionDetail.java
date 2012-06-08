package com.collegeInfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class UnionDetail {
	private int id;
	
	private int unionInfoId;
	
	private String detail;
	
	private String img;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUnionInfoId() {
		return unionInfoId;
	}

	public void setUnionInfoId(int unionInfoId) {
		this.unionInfoId = unionInfoId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
