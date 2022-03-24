package com.lti.Schemes.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.Schemes.pojo.AcademicDetails;
import com.lti.Schemes.pojo.BasicDetails;
import com.lti.Schemes.pojo.ContactDetails;
import com.lti.Schemes.pojo.FeeDetails;
import com.lti.Schemes.pojo.OtherDetails;
import com.lti.Schemes.pojo.TenthDetails;
import com.lti.Schemes.pojo.TwelthDetails;

@Repository
public class ApplyingForSchemeDAOImpl implements ApplyingForSchemeDAO{
	 @Autowired
     EntityManager eMan;
        
	    @Override
	    public boolean addAcademicDetails(AcademicDetails academicDetails) {
	    	eMan.persist(academicDetails);
	    	return true;
	    }
	    @Override
	    public boolean addBasicDetails(BasicDetails basicDetails) {
	    	eMan.persist(basicDetails);
	    	return true;
	    }
	    @Override
	    public boolean addContactDetails(ContactDetails contactDetails) {
	    	eMan.persist(contactDetails);
	    	return true;
	    }
	    @Override
	    public boolean addFeeDetails(FeeDetails feeDetails) {
	    	eMan.persist(feeDetails);
	    	return true;
	    }
	    @Override
	    public boolean addOtherDetails(OtherDetails otherDetails) {
	    	eMan.persist(otherDetails);
	    	return true;
	    }
	    @Override
	    public boolean addTenthDetails(TenthDetails tenthDetails) {
	    	eMan.persist(tenthDetails);
	    	return true;
	    }
	    @Override
	    public boolean addTwelthDetails(TwelthDetails twelthDetails) {
	    	eMan.persist(twelthDetails);
	    	return true;
	    }
	    @Override
	    public List<AcademicDetails> getAcademicDetails(){
	    	return eMan.createQuery("from AcademicDetails").getResultList();
	    }
	    @Override
		public List<BasicDetails> getBasicDetails(){
	    	return eMan.createQuery("from BasicDetails").getResultList();
	    }
	    @Override
		public List<ContactDetails> getContactDetails(){
	    	return eMan.createQuery("from ContactDetails").getResultList();
	    }
	    @Override
		public List<FeeDetails> getFeeDetails(){
	    	return eMan.createQuery("from FeeDetails").getResultList();
	    }
	    @Override
		public List<OtherDetails> getOtherDetails(){
	    	return eMan.createQuery("from OtherDetails").getResultList();
	    }
	    @Override
		public List<TenthDetails> getTenthDetails(){
	    	return eMan.createQuery("from TenthDetails").getResultList();
	    }
	    @Override
		public List<TwelthDetails> getTwelthDetails(){
	    	return eMan.createQuery("from TwelthDetails").getResultList();
	    }
}
