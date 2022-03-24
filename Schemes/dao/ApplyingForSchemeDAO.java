package com.lti.Schemes.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.Schemes.pojo.AcademicDetails;
import com.lti.Schemes.pojo.BasicDetails;
import com.lti.Schemes.pojo.ContactDetails;
import com.lti.Schemes.pojo.FeeDetails;
import com.lti.Schemes.pojo.OtherDetails;
import com.lti.Schemes.pojo.TenthDetails;
import com.lti.Schemes.pojo.TwelthDetails;

@Repository
public interface ApplyingForSchemeDAO {
	public List<AcademicDetails> getAcademicDetails();
	public List<BasicDetails> getBasicDetails();
	public List<ContactDetails> getContactDetails();
	public List<FeeDetails> getFeeDetails();
	public List<OtherDetails> getOtherDetails();
	public List<TenthDetails> getTenthDetails();
	public List<TwelthDetails> getTwelthDetails();
	boolean addAcademicDetails(AcademicDetails academicDetails);
	boolean addBasicDetails(BasicDetails basicDetails);
	boolean addContactDetails(ContactDetails contactDetails);
	boolean addFeeDetails(FeeDetails feeDetails);
	boolean addOtherDetails(OtherDetails otherDetails);
	boolean addTenthDetails(TenthDetails tenthDetails);
	boolean addTwelthDetails(TwelthDetails twelthDetails);
}
