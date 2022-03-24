package com.lti.Schemes.service;

import java.util.List;

import com.lti.Schemes.pojo.AcademicDetails;
import com.lti.Schemes.pojo.BasicDetails;
import com.lti.Schemes.pojo.ContactDetails;
import com.lti.Schemes.pojo.FeeDetails;
import com.lti.Schemes.pojo.OtherDetails;
import com.lti.Schemes.pojo.TenthDetails;
import com.lti.Schemes.pojo.TwelthDetails;

public interface ApplyingForSchemeService {
	public List<AcademicDetails> getAcademicDetails();
	public List<BasicDetails> getBasicDetails();
	public List<ContactDetails> getContactDetails();
	public List<FeeDetails> getFeeDetails();
	public List<OtherDetails> getOtherDetails();
	public List<TenthDetails> getTenthDetails();
	public List<TwelthDetails> getTwelthDetails();
	public boolean addAcademicDetails(AcademicDetails academicDetails);
	public boolean addBasicDetails(BasicDetails basicDetails);
	public boolean addContactDetails(ContactDetails contactDetails);
	public boolean addFeeDetails(FeeDetails feeDetails);
	public boolean addOtherDetails(OtherDetails otherDetails);
	public boolean addTenthDetails(TenthDetails tenthDetails);
	public boolean addTwelthDetails(TwelthDetails twelthDetails);
}
