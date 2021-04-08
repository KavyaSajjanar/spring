package com.xworkz.cust;

import com.xworkz.cust.entity.CustomerEntity;
import com.xworkz.cust.repository.CustomerRepository;
import com.xworkz.cust.repository.CustomerRepositoryImpl;
import com.xworkz.cust.service.CustomerService;
import com.xworkz.cust.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		CustomerEntity entity = new CustomerEntity("kav", "Rajajinagar Bangalore", 4, 8050172934f,
				"kavya.xworkz@gmail.com", "female");
		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		CustomerService customer = new CustomerServiceImpl(customerRepository);
		customer.validateAndSave(entity);

	}

	}


