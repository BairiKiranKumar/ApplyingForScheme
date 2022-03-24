package com.lti.Schemes;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lti.Schemes.pojo.AcademicDetails;
import com.lti.Schemes.pojo.BasicDetails;
import com.lti.Schemes.pojo.ContactDetails;
import com.lti.Schemes.pojo.FeeDetails;
import com.lti.Schemes.pojo.OtherDetails;
import com.lti.Schemes.pojo.TenthDetails;
import com.lti.Schemes.pojo.TwelthDetails;

@SpringBootApplication
public class ApplyingForScheme {

	public static void main(String[] args) {
		SpringApplication.run(ApplyingForScheme.class, args);
		System.out.println(" Successfully Done");
	}

	public List<AcademicDetails> getAcademicDetails() {
		// TODO Auto-generated method stub
		return  getAcademicDetails();
	}

	public List<BasicDetails> getBasicDetails() {
		// TODO Auto-generated method stub
		return getBasicDetails();
	}

	public List<ContactDetails> getContactDetails() {
		// TODO Auto-generated method stub
		return getContactDetails();
	}

	public List<FeeDetails> getFeeDetails() {
		// TODO Auto-generated method stub
		return getFeeDetails();
	}

	public List<OtherDetails> getOtherDetails() {
		// TODO Auto-generated method stub
		return getOtherDetails();
	}

	public List<TenthDetails> getTenthDetails() {
		// TODO Auto-generated method stub
		return getTenthDetails();
	}

	public List<TwelthDetails> getTwelthDetails() {
		// TODO Auto-generated method stub
		return getTwelthDetails();
	}

	public boolean addAcademicDetails(AcademicDetails academicDetails) {
		// TODO Auto-generated method stub
		return addAcademicDetails(academicDetails);
	}

	public boolean addBasicDetails(BasicDetails basicDetails) {
		// TODO Auto-generated method stub
		return addBasicDetails(basicDetails);
	}

	public boolean addContactDetails(ContactDetails contactDetails) {
		// TODO Auto-generated method stub
		return addContactDetails(contactDetails);
	}

	public boolean addFeeDetails(FeeDetails feeDetails) {
		// TODO Auto-generated method stub
		return addFeeDetails(feeDetails);
	}

	public boolean addOtherDetails(OtherDetails otherDetails) {
		// TODO Auto-generated method stub
		return addOtherDetails(otherDetails);
	}

	public boolean addTenthDetails(TenthDetails tenthDetails) {
		// TODO Auto-generated method stub
		return addTenthDetails(tenthDetails);
	}

	public boolean addTwelthDetails(TwelthDetails twelthDetails) {
		// TODO Auto-generated method stub
		return addTwelthDetails(twelthDetails);
	}

}
