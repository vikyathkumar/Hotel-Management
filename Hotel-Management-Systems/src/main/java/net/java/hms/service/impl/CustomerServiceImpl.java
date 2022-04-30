package net.java.hms.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.hms.model.Customer;
import net.java.hms.repository.CustomerRepository;
import net.java.hms.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> getAllCustomer() 
	{
		return customerRepository.findAll();
	}


	@Override
	public void saveCustomer(Customer customer)
	{
		this.customerRepository.save(customer);
		
	}


	@Override
	public Customer getCustomerById(long id) 
	{
		 Optional < Customer > optional = customerRepository.findById(id);
	        Customer customer = null;
	        if (optional.isPresent()) {
	            customer = optional.get();
	        } else {
	            throw new RuntimeException(" Customer not found for id :: " + id);
	        }
	        return customer;
		
	}


	@Override
    public void deleteCustomerById(long id) {
        this.customerRepository.deleteById(id);
    }
}
