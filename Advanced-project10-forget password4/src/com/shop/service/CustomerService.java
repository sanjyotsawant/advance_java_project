package com.shop.service;

import java.util.List;

import com.shop.dto.Customer;
import com.shop.dto.cust_prod;

public interface CustomerService {
	int addCustomer(Customer cust);
	Customer findCust(int cid);
	void addCP(cust_prod cp);
	List<cust_prod> selCP(int cid);
	
	void deleteCust1(cust_prod c);
}
