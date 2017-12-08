package com.assigment.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assigment.cloud.model.CustomerTO;
import com.assigment.cloud.service.CloudService;


@RestController
@RequestMapping(value="/customer")
public class LoginController {
	@Autowired
	private CloudService service;
	
	@RequestMapping(value="/view",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerTO> getDoctorDetails() {
		return service.getCustomerDetails();
	}
}
