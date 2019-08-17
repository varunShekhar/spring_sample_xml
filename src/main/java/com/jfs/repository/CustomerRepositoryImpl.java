package com.jfs.repository;
import java.util.*;
import com.jfs.model.Customer;
public class CustomerRepositoryImpl implements CustomerRepository {
	@Override
	public ArrayList<Customer> findAll(){
		ArrayList<Customer> customers = new ArrayList<Customer>();
	Customer customer = new Customer();
	customer.setFirstname("Sam");
	customer.setLastname("Pat");
	customers.add(customer);
	//System.out.println("shit");
	return customers;
	}

}
