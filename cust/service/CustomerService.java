package com.xworkz.cust.service;

import com.xworkz.cust.entity.CustomerEntity;

public interface CustomerService {
	public boolean validateAndSave(CustomerEntity entity);
}
