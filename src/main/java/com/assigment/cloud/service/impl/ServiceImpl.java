package com.assigment.cloud.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.assigment.cloud.dao.CustomerInfo;
import com.assigment.cloud.domain.Customer;
import com.assigment.cloud.model.CustomerTO;
import com.assigment.cloud.service.CloudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements CloudService {
	@Autowired
	private CustomerInfo customer;
	
	@Override
	public List<CustomerTO> getCustomerDetails() {
		List<CustomerTO> customersList=new ArrayList<CustomerTO>();
		List<Customer> customers=(List<Customer>) customer.findAll();
		if(customers.size() > 0){
			for(Customer cust : customers){
				CustomerTO custt=new CustomerTO();
				custt.setCustid(cust.getCustID());
				custt.setCustMailId(cust.getCustMail());
				custt.setCustMobile(cust.getCustPHONE());
				custt.setCustName(cust.getCustNAME());
				customersList.add(custt);
			}
			return customersList;
		}
		else{
			CustomerTO custt=new CustomerTO();
			custt.setCustid("No entry");
			custt.setCustMailId("");
			custt.setCustMobile("");
			custt.setCustName("");
			customersList.add(custt);
			return customersList;
		}
	}

}
