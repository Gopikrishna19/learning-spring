package com.gopikrishna19.learningSpring.service;

import com.gopikrishna19.learningSpring.model.Customer;
import com.gopikrishna19.learningSpring.repositories.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
