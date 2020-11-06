package com.shop.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.shop.dto.Product;

@Repository
public class ProductDaoImple implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertProduct(Product prod) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(prod);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public void updateProduct(Product prod) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(prod);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
		
	}

	@Override
	public void deleteProduct(int productId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.delete(new Product(productId));
				System.out.println("done");
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public List<Product> selectAll() {
		List<Product> expList = hibernateTemplate.execute(new HibernateCallback<List<Product>>() {

			@Override
			public List<Product> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Product");
				List<Product> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return expList;
	}

	@Override
	public List<Product> selectCat(Product prod) {
		List<Product> expList = hibernateTemplate.execute(new HibernateCallback<List<Product>>() {

			@Override
			public List<Product> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from Product where category = ?");
				q.setString(0, prod.getCategory());
				
				List<Product> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return expList;
	}

	@Override
	public Product selectProduct(int productId) {
		Product prod = hibernateTemplate.execute(new HibernateCallback<Product>() {

			@Override
			public Product doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Product pr = (Product)session.get(Product.class, productId);
				tr.commit();
				session.flush();
				session.close();
				return pr;
			}
			
		});
		return prod;
	}

	@Override
	public void decQuantity(int productId) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("update Product set quantity=quantity-1 where productId = ?");
				//System.out.println();
				q.setInteger(0, productId);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		
	}

	@Override
	public boolean checkProd(String productName) {
		
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q= session.createQuery("from Product where productName =?");
				
				q.setString(0, productName);
				
				List<Product> li =q.list();
				boolean flag = ! li.isEmpty();
				
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

}
