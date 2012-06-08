package com.collegeInfo.action;

import com.collegeInfo.dao.NewComeDAO;
import com.collegeInfo.model.NewComeDetail;
import com.util.BaseAction;
import com.util.JSONTools;

public class NewComeToKnowAction extends BaseAction {
	private int id;
	
	private String detail;
	
	private String img;
	
	private String newComes;
	
	private NewComeDAO ncdao = new NewComeDAO();
	
	public String ToMain(){
		newComes = JSONTools.getJsonArray(ncdao.getAllNewComes());
		id = Integer.parseInt(request.getParameter("id"));
		NewComeDetail newComeDetail = ncdao.getDetailImg(id);
		img = newComeDetail.getImg();
		detail = newComeDetail.getDetail();
		return SUCCESS;
	}
	public String getNewComes() {
		return newComes;
	}

	public void setNewComes(String newComes) {
		this.newComes = newComes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
