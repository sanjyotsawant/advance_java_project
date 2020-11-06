package com.shop.dao;

import java.util.List;

import com.shop.dto.Product;

public interface ProductDao {
	void insertProduct(Product prod);
	void updateProduct(Product prod);
	void decQuantity(int productId);
	void deleteProduct(int productId);
	boolean checkProd(String productName);
	Product selectProduct(int productId);
	List<Product> selectAll();
	List<Product> selectCat(Product prod);

}
