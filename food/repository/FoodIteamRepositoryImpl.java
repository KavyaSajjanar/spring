package com.xworkz.food.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.food.entity.FoodIteamEntity;

public class FoodIteamRepositoryImpl implements FoodIteamRepository{
public FoodIteamRepositoryImpl() {
	System.out.println("created "+this.getClass().getSimpleName());
}

	@Override
	public void save(FoodIteamEntity entity) {
		System.out.println("invoked save "+entity);
		Configuration config=new Configuration();
		config.configure();
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
		
		

		
	}


