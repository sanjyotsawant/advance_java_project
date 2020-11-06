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

import com.shop.dto.Customer;
import com.shop.dto.Product;
import com.shop.dto.cust_prod;

@Repository
public class CustomerDaoImple implements CustomerDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int insertCust(Customer cust) {
		int id=hibernateTemplate.execute(new HibernateCallback<Integer>() {

			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				session.save(cust);
				System.out.println(cust.getCustId());
				tr.commit();
				session.flush();
				session.close();
				return cust.getCustId();
			}
			
		});
		return id;
	}

	@Override
	public Customer find(int cid) {
		
		Customer cust =hibernateTemplate.execute(new HibernateCallback<Customer>() {

			@Override
			public Customer doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q= session.createQuery("from Customer where custId = ? ");
				
				q.setInteger(0,cid);
				
				List<Customer> li =q.list();
	
				tr.commit();
				session.flush();
				session.close();
				return li.get(0);
			}
			
		});

		return cust;

		
		
	}

	@Override
	public void insertCP(cust_prod cp) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				session.save(cp);
				
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public List<cust_prod> selectCP(int cid) {
		
		List<cust_prod> cpList = hibernateTemplate.execute(new HibernateCallback<List<cust_prod>>() {

			@Override
			public List<cust_prod> doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from cust_prod where c_id = ?");
				q.setInteger(0, cid);
				
				List<cust_prod> li = q.list();
				System.out.println(li);
				tr.commit();
				session.flush();
				session.close();
				return li;
			}
		});
		return cpList;
	}

	@Override
	public void deleteCust(cust_prod c) {
		
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				session.delete(c);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

}
