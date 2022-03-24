package com.lti.Schemes.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AcademicDetails")
public class AcademicDetails {
	@Id
	@Column(name="loginid")
	private String loginId;
	@Column(name="Institution")
	private String Institution;
	@Column(name="Presentclass")
	private String PresentClass;
	@Column(name="Presentclassyear")
	private String PresentClassYear;
	@Column(name="ModeofStudy")
	private String Modeofstudy;
	@Column(name="ClassStartDate")
	private String classofdate;
	@Column(name="Previousclass")
	private String PreviousClass;
	@Column(name="Previousclassyear")
	private String PreviousClassYear;
	@Column(name="previouspercentage")
	private String PreviousPercentage;
	
	public AcademicDetails() {
		super();
	}
	public String toString() {
		return "AcademicDetails[Institution="+Institution+",PresentClass="+PresentClass+",PresentClassYear="+PresentClassYear+"ModeOfStudy="+Modeofstudy+",ClassStartDate="+classofdate+",PreviousClass="+PreviousClass+",PreviousClassYear="+PreviousClassYear+",PreviousPercentage="+PreviousPercentage+"]";
	}
	public AcademicDetails(String Institution,String PresentClass,String PresentClassYear,String Modeofstudy,String classofdate,String PreviousClass,String PreviousClassYear,String PreviousPercentage) {
		super();
		this.Institution=Institution;
		this.PresentClass=PresentClass;
		this.PresentClassYear=PresentClassYear;
		this.Modeofstudy=Modeofstudy;
		this.classofdate=classofdate;
		this.PreviousClass=PreviousClass;
		this.PreviousClassYear=PreviousClassYear;
		this.PreviousPercentage=PreviousPercentage;
	}
	public String getInstitution() {
		return Institution;
	}
	public void setInstitution(String institution) {
		Institution = institution;
	}
	public String getPresentClass() {
		return PresentClass;
	}
	public void setPresentClass(String presentClass) {
		PresentClass = presentClass;
	}
	public String getPresentClassYear() {
		return PresentClassYear;
	}
	public void setPresentClassYear(String presentClassYear) {
		PresentClassYear = presentClassYear;
	}
	public String getModeofstudy() {
		return Modeofstudy;
	}
	public void setModeofstudy(String modeofstudy) {
		Modeofstudy = modeofstudy;
	}
	public String getClassofdate() {
		return classofdate;
	}
	public void setClassofdate(String classofdate) {
		this.classofdate = classofdate;
	}
	public String getPreviousClass() {
		return PreviousClass;
	}
	public void setPreviousClass(String previousClass) {
		PreviousClass = previousClass;
	}
	public String getPreviousClassYear() {
		return PreviousClassYear;
	}
	public void setPreviousClassYear(String previousClassYear) {
		PreviousClassYear = previousClassYear;
	}
	public String getPreviousPercentage() {
		return PreviousPercentage;
	}
	public void setPreviousPercentage(String previousPercentage) {
		PreviousPercentage = previousPercentage;
	}
	
}
