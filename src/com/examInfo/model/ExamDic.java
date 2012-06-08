package com.examInfo.model;
// default package

import java.util.HashSet;
import java.util.Set;

/**
 * ExamDic entity. @author MyEclipse Persistence Tools
 */

public class ExamDic implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set examInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public ExamDic() {
	}

	/** minimal constructor */
	public ExamDic(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public ExamDic(Integer id, String name, Set examInfos) {
		this.id = id;
		this.name = name;
		this.examInfos = examInfos;
	}

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

	public Set getExamInfos() {
		return this.examInfos;
	}

	public void setExamInfos(Set examInfos) {
		this.examInfos = examInfos;
	}

}