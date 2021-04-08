package com.xworkz.cust.service;

import com.xworkz.cust.entity.CustomerEntity;
import com.xworkz.cust.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("created" + this.getClass().getSimpleName());
		this.customerRepository=customerRepository;

	}
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave" + entity);
		if (entity != null) {
			System.out.println("entity is valid");
			customerRepository.save(entity);
		} else {
			System.out.println("entity is invalid");
		}
		return false;
	

	
	}

}
