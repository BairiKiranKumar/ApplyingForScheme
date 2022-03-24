package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BasicDetails")
public class BasicDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="Aadhar")
	private double Aadharno;
	@Column(name="Religion")
	private String Religion;
	@Column(name="Community")
	private String community;
	@Column(name="Father")
	private String FatherName;
	@Column(name="Mother")
	private String MotherName;
	@Column(name="FamilyAnnualIncome")
	private double AnnualIncome;
    
	public BasicDetails() {
		super();
	}
	
	@Override
	public String toString() {
		return "BasicDetails[AadharNumber="+Aadharno+",Religion="+Religion+",Community="+community+",FatherName="+FatherName+",MotherName="+MotherName+",FamilyAnnualIncome="+AnnualIncome+"]";
	}
	public BasicDetails(double Aadharno,String Religion,String community,String FatherName,String MotherName,double AnnualIncome){
		super();
		this.Aadharno=Aadharno;
		this.Religion=Religion;
		this.community=community;
		this.FatherName=FatherName;
		this.MotherName=MotherName;
		this.AnnualIncome=AnnualIncome;
	}

	public double getAadharno() {
		return Aadharno;
	}

	public void setAadharno(double aadharno) {
		Aadharno = aadharno;
	}

	public String getReligion() {
		return Religion;
	}

	public void setReligion(String religion) {
		Religion = religion;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public String getFatherName() {
		return FatherName;
	}

	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}

	public String getMotherName() {
		return MotherName;
	}

	public void setMotherName(String motherName) {
		MotherName = motherName;
	}

	public double getAnnualIncome() {
		return AnnualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}
	
}
