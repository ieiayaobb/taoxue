package com.collegeInfo.model;

public class UnionInfo {
	private int id;
	
	private int collegeId;
	
	private int unionId;
	
	private String name;
	
	private String img;
	
	private int type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public int getUnionId() {
		return unionId;
	}

	public void setUnionId(int unionId) {
		this.unionId = unionId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
