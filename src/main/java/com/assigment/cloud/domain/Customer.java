package com.assigment.cloud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@Column(name="Cust_ID",length=30)
	private String CustID;

	@Column(name="Cust_Name",length=30)
	private String CustNAME;
	
	@Column(name="Cust_Mail",length=30)
	private String CustMail;
	
	@Column(name="Cust_Pass",length=30)
	private String CustPass;
	
	public String getCustPass() {
		return CustPass;
	}

	public void setCustPass(String custPass) {
		CustPass = custPass;
	}

	@Column(name="Cust_Phone",length=30)
	private String CustPHONE;

	public String getCustID() {
		return CustID;
	}

	public void setCustID(String custID) {
		CustID = custID;
	}

	public String getCustNAME() {
		return CustNAME;
	}

	public void setCustNAME(String custNAME) {
		CustNAME = custNAME;
	}

	public String getCustMail() {
		return CustMail;
	}

	public void setCustMail(String custMail) {
		CustMail = custMail;
	}

	public String getCustPHONE() {
		return CustPHONE;
	}

	public void setCustPHONE(String custPHONE) {
		CustPHONE = custPHONE;
	}
	
	
}
