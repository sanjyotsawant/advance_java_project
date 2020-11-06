package com.shop.service;

import java.util.List;

import com.shop.dto.Product;

public interface ProductService {
	
	void addProduct(Product prod);
	void modifyProduct(Product prod);
	void modifyQuantity(int productId);
	void removeProduct(int productId);
	boolean checkProduct(String productName);
	Product findProduct(int productId);
	List<Product> select();
	List<Product> selectCategory(Product prod);

}
