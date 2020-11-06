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

import com.shop.dto.User;

@Repository
public class UserDaoImple implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				// TODO Auto-generated method stub
				Transaction tr = session.beginTransaction();
				session.save(user);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
		
	}

	@Override
	public boolean checkUser(User user) {
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q= session.createQuery("from User where userName = ? and userPass = ? ");
				
				q.setString(0, user.getUserName());
				q.setString(1, user.getUserPass());
				
				List<User> li =q.list();
				boolean flag = ! li.isEmpty();

				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

	@Override
	public String forgotPassword(String userName) {
		String password = hibernateTemplate.execute(new HibernateCallback<String>() {

			@Override
			public String doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q = session.createQuery("from User where userName = ?");
				q.setString(0, userName);
				List<User> li = q.list();
				String pass = null;
				if(!li.isEmpty())
					pass = li.get(0).getUserPass();
				tr.commit();
				session.flush();
				session.close();
				return pass;
			}
			
		});
		return password;
	}

}
