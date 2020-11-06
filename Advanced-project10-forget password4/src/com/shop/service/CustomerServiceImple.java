package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.CustomerDao;
import com.shop.dto.Customer;
import com.shop.dto.cust_prod;

@Service
public class CustomerServiceImple implements CustomerService{

	@Autowired
	private CustomerDao customerDao;

	@Override
	public int addCustomer(Customer cust) {
		return customerDao.insertCust(cust);
		
	}

	@Override
	public Customer findCust(int cid) {
		// TODO Auto-generated method stub
		return customerDao.find(cid);
	}

	@Override
	public void addCP(cust_prod cp) {
		customerDao.insertCP(cp);
	}

	@Override
	public List<cust_prod> selCP(int cid) {
		// TODO Auto-generated method stub
		return customerDao.selectCP(cid);
	}

	@Override
	public void deleteCust1(cust_prod c) {
		customerDao.deleteCust(c);
		
	}
	
	

}
