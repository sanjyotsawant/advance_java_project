package com.shop.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cust_prod")
public class cust_prod {
	@Id
	@GeneratedValue
	@Column(name="sr_no")
	private int srNo;
	
	private int c_id;
	
	private int p_id;
	
	
	public cust_prod() {
		super();
	}


	public int getSrNo() {
		return srNo;
	}


	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}


	public int getC_id() {
		return c_id;
	}


	public void setC_id(int c_id) {
		this.c_id = c_id;
	}


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	
}
