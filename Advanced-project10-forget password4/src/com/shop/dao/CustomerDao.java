package com.shop.dao;

import java.util.List;

import com.shop.dto.Customer;
import com.shop.dto.cust_prod;

public interface CustomerDao {
	int insertCust(Customer cust);
	Customer find(int cid);
	void deleteCust(cust_prod c );
	void insertCP(cust_prod cp);
	List<cust_prod> selectCP(int cid);
}
