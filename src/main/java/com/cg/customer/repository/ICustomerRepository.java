package com.cg.customer.repository;

import com.cg.customer.entities.Customer;

public interface ICustomerRepository {
	public Customer add(Customer customer);
	public Customer update(Customer customer);
	public Customer findById(Long id);
}
