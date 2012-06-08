package com.collegeInfo.action;

import com.collegeInfo.dao.UnionInfoDAO;
import com.collegeInfo.model.UnionDetail;
import com.util.BaseAction;
import com.util.JSONTools;

public class UnionInfoAction extends BaseAction{
	private int id;
	
	private int collegeId;
	
	private int unionId;
	
	private String detail;
	
	private String img;
	
	private String unionInfos;
	
	private String councilInfos;
	
	private UnionInfoDAO uidao=new UnionInfoDAO();
	/**
	 * 页面跳转
	 * @return 跳转成功标识
	 */
	public String ToMain(){
		unionInfos = JSONTools.getJsonArray(uidao.getAllUnionInfo());
		councilInfos = JSONTools.getJsonArray(uidao.getAllCouncils());
		return SUCCESS;
	}
	public String ToDetail(){
		unionInfos=JSONTools.getJsonArray(uidao.getUnionInfos(unionId));
		UnionDetail udtemp = uidao.getDetailImg(unionId, collegeId);
		detail=udtemp.getDetail();
		img=udtemp.getImg();
		return "detail";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUnionInfos() {
		return unionInfos;
	}
	public void setUnionInfos(String unionInfos) {
		this.unionInfos = unionInfos;
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
	public String getCouncilInfos() {
		return councilInfos;
	}
	public void setCouncilInfos(String councilInfos) {
		this.councilInfos = councilInfos;
	}
}
