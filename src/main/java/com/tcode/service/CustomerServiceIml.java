package com.tcode.service;

import java.util.List;

import com.tcode.model.Customer;
import com.tcode.repository.CustomerRepository;

public class CustomerServiceIml implements CustomerService {

	public CustomerRepository customerRepository;

	public CustomerServiceIml() {

	}

	public CustomerServiceIml(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;

	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}