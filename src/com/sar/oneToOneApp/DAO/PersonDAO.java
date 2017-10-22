package com.sar.oneToOneApp.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.jehm7.singletonApp.HibernateUtil;

import com.sar.oneToOneApp.DTO.PersonDTO;

public class PersonDAO {
	
	public PersonDAO() {
		System.out.println(this.getClass().getSimpleName()+"created");	
	}
	
	public void saveDB(PersonDTO dto)
	{
		Session session=HibernateUtil.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(dto);
		tx.commit();
		
		session.close();
		
	}
}
