package com.lti.Schemes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.Schemes.pojo.AcademicDetails;
import com.lti.Schemes.pojo.BasicDetails;
import com.lti.Schemes.pojo.ContactDetails;
import com.lti.Schemes.pojo.FeeDetails;
import com.lti.Schemes.pojo.OtherDetails;
import com.lti.Schemes.pojo.TenthDetails;
import com.lti.Schemes.pojo.TwelthDetails;
import com.lti.Schemes.service.ApplyingForSchemeService;

@RestController
@RequestMapping("/rest/api/")
public class ApplyingForSchemeController {
	@Autowired
	ApplyingForSchemeService aService;
	      @GetMapping("/AcademicDetails")
	      public List<AcademicDetails> getAcademicDetails(){
	    	  return aService.getAcademicDetails();
	      }
	      @PostMapping("/AcademicDetails")
	      public boolean addAcademicDetails(@RequestBody AcademicDetails academicDetails) {
	    	  return aService.addAcademicDetails(academicDetails);
	      }
	      @GetMapping("/BasicDetails")
	      public List<BasicDetails> getBasicDetails(){
	    	  return aService.getBasicDetails();
	      }
	      @PostMapping("/BasicDetails")
	      public boolean addBasicDetails(@RequestBody BasicDetails basicDetails) {
	    	  return aService.addBasicDetails(basicDetails);
	      }
	      @GetMapping("/ContactDetails")
	      public List<ContactDetails> getContactDetails(){
	    	  return aService.getContactDetails();
	      }
	      @PostMapping("/ContactDetails")
	      public boolean addContactDetails(@RequestBody ContactDetails contactDetails) {
	    	  return aService.addContactDetails(contactDetails);
	      }
	      @GetMapping("/FeeDetails")
	      public List<FeeDetails> getFeeDetails(){
	    	  return aService.getFeeDetails();
	      }
	      @PostMapping("/FeeDetails")
	      public boolean addFeeDetails(@RequestBody FeeDetails feeDetails) {
	    	  return aService.addFeeDetails(feeDetails);
	      }
	      @GetMapping("/OtherDetails")
	      public List<OtherDetails> getOtherDetails(){
	    	  return aService.getOtherDetails();
	      }
	      @PostMapping("/OtherDetails")
	      public boolean addOtherDetails(@RequestBody OtherDetails otherDetails) {
	    	  return aService.addOtherDetails(otherDetails);
	      }
	      @GetMapping("/TenthDetails")
	      public List<TenthDetails> getTenthDetails(){
	    	  return aService.getTenthDetails();
	      }
	      @PostMapping("/TenthDetails")
	      public boolean addTenthDetails(@RequestBody TenthDetails tenthDetails) {
	    	  return aService.addTenthDetails(tenthDetails);
	      }
	      @GetMapping("/TwelthDetails")
	      public List<TwelthDetails> getTwelthDetails(){
	    	  return aService.getTwelthDetails();
	      }
	      @PostMapping("/TwelthDetails")
	      public boolean addTwelthDetails(@RequestBody TwelthDetails twelthDetails) {
	    	  return aService.addTwelthDetails(twelthDetails);
	      }

}
