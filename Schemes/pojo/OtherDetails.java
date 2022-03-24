package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OtherDetails")
public class OtherDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="IsDisabled")
	private boolean isdisabled;
	@Column(name="TypeOfDisability")
	private String typeofdisability;
	@Column(name="Disability%")
	private int disablitypercentage;
	@Column(name="MaritalStatus")
	private String maritalstatus;
	@Column(name="ParentsProfession")
	private String parentsprofession;
	
	public OtherDetails() {
		super();
	}
	
	public String toString() {
		return "OtherDetails[IsDisabled="+isdisabled+",TypeOfDisability="+typeofdisability+",MaritalStatus="+maritalstatus+",ParentsProfession="+parentsprofession+"]";
	}
	
	public OtherDetails(boolean isdisabled,String typeofdisability,int disabilitypercentage,String maritalstatus,String parentsprofession) {
		super();
		this.isdisabled=isdisabled;
		this.typeofdisability=typeofdisability;
		this.disablitypercentage=disabilitypercentage;
		this.maritalstatus=maritalstatus;
		this.parentsprofession=parentsprofession;
	}

	public boolean isIsdisabled() {
		return isdisabled;
	}

	public void setIsdisabled(boolean isdisabled) {
		this.isdisabled = isdisabled;
	}

	public String getTypeofdisability() {
		return typeofdisability;
	}

	public void setTypeofdisability(String typeofdisability) {
		this.typeofdisability = typeofdisability;
	}

	public int getDisablitypercentage() {
		return disablitypercentage;
	}

	public void setDisablitypercentage(int disablitypercentage) {
		this.disablitypercentage = disablitypercentage;
	}

	public String getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public String getParentsprofession() {
		return parentsprofession;
	}

	public void setParentsprofession(String parentsprofession) {
		this.parentsprofession = parentsprofession;
	}
	
}
