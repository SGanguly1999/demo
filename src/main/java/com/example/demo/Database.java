package com.example.demo;


import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Database
{
	public static List update(Alien h)
	{
		Meme_schema obj=new Meme_schema();
		Configuration con=new Configuration().configure().addAnnotatedClass(Meme_schema.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Query q=session.createQuery("select count(*) from Meme_schema");
		List<Long> count=q.list();
		int s=0;
		for(Long i:count)
		{
		s=i.intValue();
		}
		obj.setId(s+1);
		obj.setOwner(h.getOwner());
		obj.setCaption(h.getCaption());
		obj.setUrl(h.getUrl().trim());
		Transaction tx=session.beginTransaction();
				session.save(obj);
				q=session.createQuery("from Meme_schema order by id DESC").setMaxResults(100);
				List<Meme_schema> o=q.list();
				tx.commit();
				return o;
	}
	
}