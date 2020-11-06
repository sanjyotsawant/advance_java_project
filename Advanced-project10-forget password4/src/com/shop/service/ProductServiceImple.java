package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dao.ProductDao;
import com.shop.dto.Product;

@Service
public class ProductServiceImple implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	
	@Override
	public void addProduct(Product prod) {
		productDao.insertProduct(prod);
		
	}
	
	

	@Override
	public void modifyProduct(Product prod) {
		productDao.updateProduct(prod);
		
	}

	@Override
	public void removeProduct(int productId) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> select() {
		// TODO Auto-generated method stub
		return productDao.selectAll();
	}

	@Override
	public List<Product> selectCategory(Product prod) {
		
		return productDao.selectCat(prod);
	}



	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		return productDao.selectProduct(productId);
	}



	@Override
	public void modifyQuantity(int productId) {
		productDao.decQuantity(productId);
		
	}



	@Override
	public boolean checkProduct(String productName) {
		// TODO Auto-generated method stub
		return productDao.checkProd(productName);
	}

}
