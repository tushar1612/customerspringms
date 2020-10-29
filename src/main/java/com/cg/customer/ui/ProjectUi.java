package com.cg.customer.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.customer.entities.Customer;
import com.cg.customer.service.ICustomerService;


@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service;

	public void run()
	{
		Customer customer = add(1L, "tushar");
		Customer customer1 = add(2L, "Gaurav");
		Customer customer2= add(3L, "kabir");
		Long id1 = customer.getId();
		System.out.println("Before update: "+customer.toString());
		customer = update(id1, "gaurav");
		System.out.println("After update: "+customer.toString());
		System.out.println("Before update: "+customer1.toString());
		Long id2 = customer1.getId();
		customer1 = update(id2, "tushar");
		System.out.println("After update: "+customer1.toString());
		System.out.println(customer2.toString());
	}
	
	public Customer add(Long id, String name)
	{
		Customer customer = new Customer(id, name);
		customer = service.register(customer);
		return customer;
	}
	
	public Customer update(Long id, String newName)
	{
		return service.updateName(id, newName);
	}
	
}
