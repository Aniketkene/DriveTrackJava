package com.dtr.pojo;

import java.sql.Date;

public class Drive {
	private int driveId;
	private String companyName;
	private int resourcesNo;
	private int experienceReq;
	private float ctcOffer;
	private int joinCriterion;
	private float bondYrs;
	private int positionDesc;
	private Date dateFollowup;
	private int educationCtr;
	private int currentStats;
	private int nxtAction;
	private Date dtNxtAction;
	private int reqPassYr;
	private int reqGap;
	private Date dtDrivCreation;
	private int idTpo;
	
	public int getDriveId() {
		return driveId;
	}

	public void setDriveId(int driveId) {
		this.driveId = driveId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getResourcesNo() {
		return resourcesNo;
	}
	public void setResourcesNo(int resourcesNo) {
		this.resourcesNo = resourcesNo;
	}
	public int getExperienceReq() {
		return experienceReq;
	}
	public void setExperienceReq(int experienceReq) {
		this.experienceReq = experienceReq;
	}
	public float getCtcOffer() {
		return ctcOffer;
	}
	public void setCtcOffer(float ctcOffer) {
		this.ctcOffer = ctcOffer;
	}
	public int getJoinCriterion() {
		return joinCriterion;
	}
	public void setJoinCriterion(int joinCriterion) {
		this.joinCriterion = joinCriterion;
	}
	public float getBondYrs() {
		return bondYrs;
	}
	public void setBondYrs(float bondYrs) {
		this.bondYrs = bondYrs;
	}
	public int getPositionDesc() {
		return positionDesc;
	}
	public void setPositionDesc(int positionDesc) {
		this.positionDesc = positionDesc;
	}
	public Date getDateFollowup() {
		return dateFollowup;
	}
	public void setDateFollowup(Date dateFollowup) {
		this.dateFollowup = dateFollowup;
	}
	public int getEducationCtr() {
		return educationCtr;
	}
	public void setEducationCtr(int educationCtr) {
		this.educationCtr = educationCtr;
	}
	public int getCurrentStats() {
		return currentStats;
	}
	public void setCurrentStats(int currentStats) {
		this.currentStats = currentStats;
	}
	public int getNxtAction() {
		return nxtAction;
	}
	public void setNxtAction(int nxtAction) {
		this.nxtAction = nxtAction;
	}
	public Date getDtNxtAction() {
		return dtNxtAction;
	}
	public void setDtNxtAction(Date dtNxtAction) {
		this.dtNxtAction = dtNxtAction;
	}
	public int getReqPassYr() {
		return reqPassYr;
	}
	public void setReqPassYr(int reqPassYr) {
		this.reqPassYr = reqPassYr;
	}
	public int getReqGap() {
		return reqGap;
	}
	public void setReqGap(int reqGap) {
		this.reqGap = reqGap;
	}
	public Date getDtDrivCreation() {
		return dtDrivCreation;
	}
	public void setDtDrivCreation(Date dtDrivCreation) {
		this.dtDrivCreation = dtDrivCreation;
	}
	public int getIdTpo() {
		return idTpo;
	}
	public void setIdTpo(int idTpo) {
		this.idTpo = idTpo;
	}
	@Override
	public String toString() {
		return "Drive [companyName=" + companyName + ", resourcesNo=" + resourcesNo + ", experienceReq=" + experienceReq
				+ ", ctcOffer=" + ctcOffer + ", joinCriterion=" + joinCriterion + ", bondYrs=" + bondYrs
				+ ", positionDesc=" + positionDesc + ", dateFollowup=" + dateFollowup + ", educationCtr=" + educationCtr
				+ ", currentStats=" + currentStats + ", nxtAction=" + nxtAction + ", dtNxtAction=" + dtNxtAction
				+ ", reqPassYr=" + reqPassYr + ", reqGap=" + reqGap + ", dtDrivCreation=" + dtDrivCreation + ", idTpo="
				+ idTpo + "]";
	}



}
