package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ContatactDetails")
public class ContactDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="State")
	private String state;
	@Column(name="District")
	private String district;
	@Column(name="Taluk")
	private String taluk;
	@Column(name="Houseno")
	private String houseno;
	@Column(name="Streetno")
	private String streetno;
	@Column(name="pincode")
	private int pincode;
	
	public ContactDetails() {
		super();
	}
	
	public String toString() {
		return "ContactDetails[State="+state+",District="+district+",Taluk="+taluk+",HouseNo="+houseno+",StreetNo="+streetno+",Pincode="+pincode+"]";
	}
	
	public ContactDetails(String state,String district,String taluk,String houseno,String streetno,int pincode) {
		super();
		this.state=state;
		this.district=district;
		this.taluk=taluk;
		this.houseno=houseno;
		this.streetno=streetno;
		this.pincode=pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getStreetno() {
		return streetno;
	}

	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
