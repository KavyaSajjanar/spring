package com.xworkz.cust.repository;

import com.xworkz.cust.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" + entity);
		
	}

}
