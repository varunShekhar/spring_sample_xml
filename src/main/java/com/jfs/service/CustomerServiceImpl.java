/*
package com.jfs.service;
import java.util.ArrayList;
import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
	@Override
	public ArrayList<Customer> findAll() {
		//System.out.println("works");
		return customerRepository.findAll();
	}
}*/
package com.jfs.service;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
import com.jfs.repository.CustomerRepositoryImpl;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}

	//private CustomerRepository customerRepository = new CustomerRepositoryImpl();
	//@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}

