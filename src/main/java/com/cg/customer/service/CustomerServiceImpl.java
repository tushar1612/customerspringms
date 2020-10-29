package com.cg.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.customer.entities.Customer;
import com.cg.customer.repository.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository repository;
	
	@Override
	public Customer register(Customer customer) {
		customer = repository.add(customer);
		return customer;
	}
	

	@Override
	public Customer updateName(Long id, String name) {
		Customer customer = repository.findById(id);
		customer.setName(name);
		customer = repository.update(customer);
		return customer;
	}

}
