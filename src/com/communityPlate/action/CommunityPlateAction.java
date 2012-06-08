package com.communityPlate.action;

import com.communityPlate.dao.CommunityPlateDAO;
import com.communityPlate.model.CommunityDetail;
import com.util.BaseAction;
import com.util.JSONTools;

public class CommunityPlateAction extends BaseAction {
	private int id;
	
	private int type;
	
	private String img;
	
	private String detail;
	
	private String communityInfos;
	
	private CommunityPlateDAO cpdao = new CommunityPlateDAO();
	public String ToMain(){
		communityInfos = JSONTools.getJsonArray(cpdao.getAllCommunityInfo());
		return SUCCESS;
	}
	public String ToDetail(){
		id = Integer.parseInt(this.request.getParameter("id"));
		communityInfos = JSONTools.getJsonArray(cpdao.geCommunityInfos(type));
		CommunityDetail adtemp = cpdao.getDetailImg(id);
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
	public String getCommunityInfos() {
		return communityInfos;
	}
	public void setCommunityInfos(String communityInfos) {
		this.communityInfos = communityInfos;
	}
}
