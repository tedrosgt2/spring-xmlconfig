package com.tcode.repository;


import java.util.ArrayList;
import java.util.List;

import com.tcode.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.tcode.repository.CustomerRepository#findall()
	 */
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Tedros");
		customer.setLastname("Getu");
		
		customers.add(customer);
		
		return customers;
		
	}

}
