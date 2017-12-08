package com.assigment.cloud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.assigment.cloud.domain.Customer;

@Transactional
public interface CustomerInfo extends CrudRepository<Customer,String> {

}
