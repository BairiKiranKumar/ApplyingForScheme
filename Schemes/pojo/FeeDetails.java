package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FeeDetails")
public class FeeDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="AdmissionFee")
	private double Admissionfee;
	@Column(name="TuitionFee")
	private double Tuitionfee;
	@Column(name="OtherFee")
	private double Otherfee;
	
	public FeeDetails() {
		super();
	}
	
	public String toString() {
		return "FeeDetails[AdmissionFee="+Admissionfee+",TuitionFee="+Tuitionfee+",OtherFee"+Otherfee+"]";
	}
	
	public FeeDetails(double Admissionfee,double Tuitionfee,double Otherfee) {
		super();
		this.Admissionfee=Admissionfee;
		this.Tuitionfee=Tuitionfee;
		this.Otherfee=Otherfee;
	}

	public double getAdmissionfee() {
		return Admissionfee;
	}

	public void setAdmissionfee(double admissionfee) {
		Admissionfee = admissionfee;
	}

	public double getTuitionfee() {
		return Tuitionfee;
	}

	public void setTuitionfee(double tuitionfee) {
		Tuitionfee = tuitionfee;
	}

	public double getOtherfee() {
		return Otherfee;
	}

	public void setOtherfee(double otherfee) {
		Otherfee = otherfee;
	}
	
}
