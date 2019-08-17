package com.jfs.repository;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.jfs.model.Customer;
@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public ArrayList<Customer> findAll(){
		ArrayList<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Sam");
		customer.setLastname("Pat");
		customers.add(customer);
     	return customers;
    	}
   }