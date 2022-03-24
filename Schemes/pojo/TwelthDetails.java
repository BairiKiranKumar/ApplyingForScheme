package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TwelthDetails")
public class TwelthDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="TwelthRollNo")
	private String TwelthRollno;
	@Column(name="TwelthBoardName")
	private String Twelthboardname;
	@Column(name="TwelthYear")
	private String Twelthyear;
	@Column(name="Twelth%")
	private int Twelthpercentage;
	
	public TwelthDetails() {
		super();
	}
	public String toString() {
		return "TenthDetails[TenthRollno="+TwelthRollno+",TenthBoardName="+Twelthboardname+",TenthYear="+Twelthyear+",TenthPercentage="+Twelthpercentage+"]";
	}
	public TwelthDetails(String TwelthRollno,String Twelthboardname,String Twelthyear,int Twelthpercentage) {
		super();
		this.TwelthRollno=TwelthRollno;
		this.Twelthboardname=Twelthboardname;
		this.Twelthyear=Twelthyear;
		this.Twelthpercentage=Twelthpercentage;
	}
	public String getTwelthRollno() {
		return TwelthRollno;
	}
	public void setTwelthRollno(String twelthRollno) {
		TwelthRollno = twelthRollno;
	}
	public String getTwelthboardname() {
		return Twelthboardname;
	}
	public void setTwelthboardname(String twelthboardname) {
		Twelthboardname = twelthboardname;
	}
	public String getTwelthyear() {
		return Twelthyear;
	}
	public void setTwelthyear(String twelthyear) {
		Twelthyear = twelthyear;
	}
	public int getTwelthpercentage() {
		return Twelthpercentage;
	}
	public void setTwelthpercentage(int twelthpercentage) {
		Twelthpercentage = twelthpercentage;
	}
	
}
