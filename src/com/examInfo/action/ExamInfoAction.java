package com.examInfo.action;

import com.examInfo.model.ExamDetail;
import com.examInfo.dao.ExamInfoDAO;
import com.util.BaseAction;
import com.util.JSONTools;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class ExamInfoAction extends BaseAction {
	private int id;
	
	private int collegeId;
	
	private int examId;
	
	private String detail;
	
	private String img;
	
	private String examInfos;
	
	private ExamInfoDAO eidao=new ExamInfoDAO();
	public String ToMain(){
		examInfos = JSONTools.getJsonArray(eidao.getAllExamInfo());
		return SUCCESS;
	}
	public String ToDetail(){
		examInfos=JSONTools.getJsonArray(eidao.getExamInfos(examId));
		ExamDetail edtemp = eidao.getDetailImg(examId, collegeId);
		detail=edtemp.getDetail();
		img=edtemp.getImg();
		return "detail";
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
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public String getExamInfos() {
		return examInfos;
	}
	public void setExamInfos(String examInfos) {
		this.examInfos = examInfos;
	}
}
