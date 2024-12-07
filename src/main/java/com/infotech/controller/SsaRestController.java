package com.infotech.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.dto.SSARequest;
import com.infotech.dto.SSAResponse;
import com.infotech.service.SsaWebService;

@RestController
class SsaRestController {

	@Autowired
	SsaWebService ssaService;
	
	Logger logger= LoggerFactory.getLogger(SsaRestController.class);

	@GetMapping("/getdata")
	public String getData() {
		 return "Got the data from Secured App";
	}
	@PostMapping("/getstate")
	public ResponseEntity<SSAResponse> getCitizenSsaDetails(@RequestBody SSARequest request) {
		logger.info("Getting SSA details started ");
		SSAResponse response =ssaService.getCitizenSsaDetails(request);
		
		if ( response.getStateName()!= null) {
			logger.info("Getting SSA details completed ");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.setSsn(request.getSsn());
			response.setStateName("No State Found");
			return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
		}

	}

}
