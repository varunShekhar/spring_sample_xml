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
import org.springframework.stereotype.Service;
import com.jfs.model.Customer;
import com.jfs.repository.CustomerRepository;
import com.jfs.repository.CustomerRepositoryImpl;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository = new CustomerRepositoryImpl();
	/* (non-Javadoc)

	 * @see com.jfs.service.CustomerService#findAll()

	 */
	@Override
	public ArrayList<Customer> findAll() {
		return customerRepository.findAll();
	}
}

