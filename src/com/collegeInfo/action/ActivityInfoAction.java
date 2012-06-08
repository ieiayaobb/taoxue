package com.collegeInfo.action;

import com.collegeInfo.dao.ActivityInfoDAO;
import com.collegeInfo.model.ActivityDetail;
import com.util.BaseAction;
import com.util.JSONTools;

public class ActivityInfoAction extends BaseAction {
	
	private int id;
	
	private int type;
	
	private String img;
	
	private String detail;
	
	private String activityInfos;
	
	private ActivityInfoDAO aidao = new ActivityInfoDAO();
	
	public String ToMain(){
		activityInfos = JSONTools.getJsonArray(aidao.getAllActivityInfo());
		return SUCCESS;
	}
	public String ToDetail(){
		id = Integer.parseInt(this.request.getParameter("id"));
		activityInfos = JSONTools.getJsonArray(aidao.getActivityInfos(type));
		ActivityDetail adtemp = aidao.getDetailImg(id);
		img = adtemp.getImg();
		detail = adtemp.getDetail();
		return "detail";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getActivityInfos() {
		return activityInfos;
	}
	public void setActivityInfos(String activityInfos) {
		this.activityInfos = activityInfos;
	}
}
