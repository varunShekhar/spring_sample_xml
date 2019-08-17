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

}
