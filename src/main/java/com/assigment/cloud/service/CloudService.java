package com.assigment.cloud.service;

import java.util.List;

import com.assigment.cloud.model.CustomerTO;

public interface CloudService {
	public List<CustomerTO> getCustomerDetails();
}
