package com.shop.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="p_id")
	private int productId;
	
	@Column(name="p_name")
	private String productName;
	
	@Column(name="price")
	private float price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="pur_date")
	private String purchaseDate;
	
	@Column(name="category")
	private String category;
	
	
	
	public Product() {
		super();
	}
	
	

	public Product(int productId) {
		super();
		this.productId = productId;
	}



	public Product(int productId, String productName, float price, int quantity, String purchaseDate, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
		this.category = category;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
