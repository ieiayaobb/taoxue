package com.examInfo.model;

// default package

/**
 * ExamInfo entity. @author MyEclipse Persistence Tools
 */

public class ExamInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer collegeId;
	private Integer examId;
	private String name;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}