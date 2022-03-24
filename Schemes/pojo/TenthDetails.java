package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TenthDetails")
public class TenthDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="TenthRollNo")
	private String TenthRollno;
	@Column(name="TenthBoardName")
	private String Tenthboardname;
	@Column(name="TenthYear")
	private String Tenthyear;
	@Column(name="Tenth%")
	private int Tenthpercentage;
	
	public TenthDetails() {
		super();
	}
	public String toString() {
		return "TenthDetails[TenthRollno="+TenthRollno+",TenthBoardName="+Tenthboardname+",TenthYear="+Tenthyear+",TenthPercentage="+Tenthpercentage+"]";
	}
	public TenthDetails(String TenthRollno,String Tenthboardname,String Tenthyear,int Tenthpercentage) {
		super();
		this.TenthRollno=TenthRollno;
		this.Tenthboardname=Tenthboardname;
		this.Tenthyear=Tenthyear;
		this.Tenthpercentage=Tenthpercentage;
	}
	public String getTenthRollno() {
		return TenthRollno;
	}
	public void setTenthRollno(String tenthRollno) {
		TenthRollno = tenthRollno;
	}
	public String getTenthboardname() {
		return Tenthboardname;
	}
	public void setTenthboardname(String tenthboardname) {
		Tenthboardname = tenthboardname;
	}
	public String getTenthyear() {
		return Tenthyear;
	}
	public void setTenthyear(String tenthyear) {
		Tenthyear = tenthyear;
	}
	public int getTenthpercentage() {
		return Tenthpercentage;
	}
	public void setTenthpercentage(int tenthpercentage) {
		Tenthpercentage = tenthpercentage;
	}
	
}
