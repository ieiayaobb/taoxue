package com.collegeServe.action;

import com.collegeInfo.model.ActivityDetail;
import com.collegeServe.dao.CollegeServeDAO;
import com.collegeServe.model.ServeDetail;
import com.util.BaseAction;
import com.util.JSONTools;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class CollegeServeAction extends BaseAction {
	private int id;
	
	private int type;
	
	private String img;
	
	private String detail;
	
	private String serveInfos;
	
	private CollegeServeDAO csdao = new CollegeServeDAO();
	
	public String ToMain(){
		serveInfos = JSONTools.getJsonArray(csdao.getAllServeInfo());
		return SUCCESS;
	}
	public String ToDetail(){
		id = Integer.parseInt(this.request.getParameter("id"));
		serveInfos = JSONTools.getJsonArray(csdao.geServeInfos(type));
		ServeDetail adtemp = csdao.getDetailImg(id);
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
	public String getServeInfos() {
		return serveInfos;
	}
	public void setServeInfos(String serveInfos) {
		this.serveInfos = serveInfos;
	}
}
